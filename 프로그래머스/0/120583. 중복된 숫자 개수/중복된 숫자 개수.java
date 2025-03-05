class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        //array에 n이 몇 개 있는지
        for(int num : array){
            if(num == n){
                answer ++;
            }
        }
        return answer;
    }
}