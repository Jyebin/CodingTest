class Solution {
    public int[] solution(int[] array) {
        //가장 큰 수와 그 수의 index
        int bigNum = 0;
        int bigIdx = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i] > bigNum){
                bigNum = array[i];
                bigIdx = i;
            }
        }

        int[] answer = new int[2];
        answer[0] = bigNum;
        answer[1] = bigIdx;
        return answer;
    }
}