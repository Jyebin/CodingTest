class Solution {
    public String[] solution(String[] strArr) {
        //홀수번 인덱스 문자 -> 대문자
        //짝수번 인덱스 문자 -> 소문자
        for(int i=0; i<strArr.length; i++){
            if(i%2 == 0){
                strArr[i] = strArr[i].toLowerCase();
            }else{
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}