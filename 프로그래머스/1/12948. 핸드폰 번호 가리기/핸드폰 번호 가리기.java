class Solution {
    public String solution(String phone_number) {
        //뒷 4자리를 제외한 나머지 숫자를 *로 가린 문자열
        String[] number = phone_number.split("");
        for(int i=0; i<number.length - 4; i++){
            number[i] = "*";
        }
        String answer = "";
        for(int i=0; i<number.length; i++){
            answer+=number[i];
        }
        return answer;
    }
}