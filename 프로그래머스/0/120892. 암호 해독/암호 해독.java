class Solution {
    public String solution(String cipher, int code) {
        //code의 배수번째 글자만 진짜 암호
        String answer = "";
        for(int i=1; i<=cipher.length(); i++){
            if(i%code == 0){
                answer += cipher.charAt(i-1);
            }
        }
        return answer;
    }
}