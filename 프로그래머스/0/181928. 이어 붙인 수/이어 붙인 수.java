class Solution {
    public int solution(int[] num_list) {
        String odd = ""; //홀수
        String even = "";
        int length = num_list.length;
        int answer = 0;
        for(int i=0; i<length; i++){
            if(num_list[i] % 2 == 0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}