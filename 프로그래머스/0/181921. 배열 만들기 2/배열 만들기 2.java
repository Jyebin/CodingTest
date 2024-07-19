import java.util.*;

class Solution {
    public ArrayList solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String numStr = i + "";
            String[] arr = numStr.split("");
            boolean isCorr = true;
            for(int j=0;j<arr.length;j++){
                if(!arr[j].equals("5") && !arr[j].equals("0")){ //5나 0이 하나라도 아닌 경우
                    isCorr = false;
                    break;
                }
            }
            if(isCorr){
                answer.add(i);
            }
        }
         if(answer.size() == 0){
                answer.add(-1);
            }
        return answer;
    }
}