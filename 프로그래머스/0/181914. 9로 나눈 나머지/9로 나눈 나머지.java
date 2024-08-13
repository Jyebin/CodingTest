class Solution {
    public int solution(String number) { 
        //9로 나눈 나머지 == 각 자리 숫자의 합 % 9
        int answer = 0;
        for(int i=0; i<number.length(); i++){
            answer = answer + number.charAt(i) - '0';
        }

        answer = answer % 9;
        return answer;
    }
}