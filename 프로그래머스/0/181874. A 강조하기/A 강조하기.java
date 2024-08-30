class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase(); //먼저 소문자로 변환
        String[] input = myString.split("");
        for(int i=0; i<input.length; i++){
            if(input[i].equals("a")){
                input[i] = "A";
            }
        }
        for(int i=0; i<input.length; i++){
            answer += input[i];
        }
        return answer;
    }
}