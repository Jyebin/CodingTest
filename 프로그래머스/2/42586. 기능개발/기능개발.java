import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        //진도가 100%일 때 서비스 반영 가능
        //각 배포마다 몇 개의 기능이 완성되는지 -> 배포는 하루에 한 번
        // -> 얼마나 걸리는 계산
        int length = progresses.length;
        int[] time = new int[length];
        ArrayList<Integer> answer = new ArrayList<>();
        //걸리는 시간 : (100 - progresses) / speeds
        for(int i=0; i<length; i++){
            time[i] = (int)Math.ceil( (100 - progresses[i]) / (double)speeds[i] ); //올림
        }
        
        int cnt = 1;
        int now = time[0]; //맨 처음 꺼가 기준
        
        for(int i=1; i<length; i++){
            if(now < time[i]){ //앞에꺼가 더 작으면 배포 가능
                answer.add(cnt);
                now = time[i];
                cnt = 1;
            } else { //처음꺼보다 이후꺼가 큰 경우 배포 불가 -> 끝난 상태로 기다려야 함
                cnt ++;
            }
        }
        
        answer.add(cnt); //남은애들 추가
        return answer;
    }
}