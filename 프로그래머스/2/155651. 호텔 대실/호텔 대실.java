import java.util.*;

class Solution {
    public int solution(String[][] book_time) { //예약 시간이 문자열 형태로 담김
        //종료시간에 10을 더하기
        //[][0] : 시작시간
        //[][1] : 종료시간
        //end값과 start값을 비교해서 현재 end값 뒤에 다음 start가 가능하면 end값을 새 end값으로 변경
        //안되면 새로운 end값을 넣기
        int[][] time = new int[book_time.length][2];
        
        for(int i=0; i<book_time.length; i++){
            int start = Integer.parseInt(book_time[i][0].replace(":","")); //시작시간
            int end = Integer.parseInt(book_time[i][1].replace(":","")); //종료시간
            end = end + 10; //끝나는 시간 + 10

            if(end % 100 >= 60){
                end = end + 40;
            }
            
            //System.out.println("end : " + end);
            time[i][0] = start;
            time[i][1] = end;            
        }
        
        Arrays.sort(time, new Comparator<int[]>(){
           //종료 시간을 기준으로 오름차순 정렬. 만약 같다면 시작 시간을 기준으로 오름차순 정렬
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] - o2[0];
            }
        });
        
        //이미 정렬되어 있는 것들을 넣기 -> 우선순위큐 : 가장 작은 요소가 우선순위를 가져서 먼저 배치됨
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<time.length; i++){
            int startT = time[i][0];
            int endT = time[i][1];
            
            //큐가 비어있으면 add
            if(!queue.isEmpty() && queue.peek() <= startT){ //큐의 가장 작은 값이 시작 시간보다 작으면
                queue.poll(); //맨 앞 요소 제거
            }
            queue.offer(endT);
        }
        return queue.size();
    }
}