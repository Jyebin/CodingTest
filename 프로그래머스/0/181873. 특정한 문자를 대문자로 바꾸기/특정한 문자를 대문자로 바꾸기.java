class Solution {
    public String solution(String my_string, String alp) {
        my_string = my_string.toLowerCase();
        String[] input = my_string.split("");
        String answer = "";
        for(int i=0; i<input.length; i++){
            if(input[i].equals(alp)){
                input[i] = input[i].toUpperCase();
            }
        }
        for(int i=0; i<input.length; i++){
            answer += input[i];
        }
        return answer;
    }
}