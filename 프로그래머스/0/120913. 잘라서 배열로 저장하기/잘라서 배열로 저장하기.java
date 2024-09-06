class Solution {
    public String[] solution(String my_str, int n) {
         String[] answer = new String[(my_str.length() + n - 1) / n];
         int k = 0;
        for(int i=0; i<answer.length; i++){
            if(k + n >= my_str.length()){
                answer[i] = my_str.substring(k);
            }else{
                answer[i] = my_str.substring(k, n+k);
            }
            k += n;
        }
        return answer;
    }
}