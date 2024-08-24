class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        //code의 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자 return
        String[] word = code.split("");
        for(int i=0; i<word.length; i++){
            if(i%q == r){ //나머지가 r이랑 같으면
                answer += word[i];
            }
        }
        return answer;
    }
}