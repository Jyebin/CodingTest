import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    boolean[] visited;
    ArrayList<String> list;
    ArrayList<String> answer;
    boolean isFinished = false;
    
    public ArrayList<String> solution(String[][] tickets) {
        //항상 ICN 공항에서 출발
        //tickets[][0] : 출발지
        //tickets[][1] : 도착지
        //우선, 뒤에꺼를 기준으로 정렬
        visited = new boolean[tickets.length];
        
        Arrays.sort(tickets, (a,b) -> {
            if(a[0].equals(b[0])){ //출발지가 같은 경우
                return a[1].compareTo(b[1]); //도착지 기준
            }else{
                return a[0].compareTo(b[0]); //출발지 기준
            }
        });
        
        String end = "";
        answer = new ArrayList<>();
        
        for(int i=0; i<tickets.length; i++){
            if(tickets[i][0].equals("ICN")){
                list = new ArrayList<>(); //인천이면 새로운 배열 만듦
                list.add("ICN");
                visited[i] = true;
                end = tickets[i][1];
                list.add(end);
                dfs(tickets, end, 1);
                visited[i] = false;
                if(isFinished){
                    break;
                }
            }
        }
        
        return answer;
    }
    
    void dfs(String[][] tickets, String end, int cnt){
        if(cnt == tickets.length){
            answer = new ArrayList<>(list);
            isFinished = true;
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(end.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                list.add(tickets[i][1]); //도착지 넣기
                dfs(tickets, tickets[i][1], cnt + 1);
                visited[i] = false;
                list.remove(list.size() - 1); //맨 뒤 요소 삭제
                
                if(isFinished){
                    return;
                }
            }
        }
    }
}