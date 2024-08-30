class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int answer2 = 0;
        int len = num_list.length;
        for(int i=0; i<len; i++){
            if(len >= 11){
                answer2 += num_list[i];
                answer = answer2;
            }else if(len <= 10){
                answer *= num_list[i];
            }
        }
        return answer;
    }
}