import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] prices) {
        ArrayList<Integer> answer = new ArrayList<>();
        //index를 늘리면서 같거나 같을 때 까지 1초 ++
        
        for(int i=0; i<prices.length; i++){
            int sec = 0; //시작시점에는 무조건 1초
            int now = prices[i];
            
            for(int j=i+1; j<prices.length; j++){
                int next = prices[j];
                sec ++;
                if(now > next){
                    break;
                }
            }
            answer.add(sec);
        }
        return answer;
    }
}