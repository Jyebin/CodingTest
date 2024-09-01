class Solution {
    public int solution(int n) {
        //n의 각 자리 숫자의 합 return
        String input = n + "";
        int answer = 0;
        for(int i=0; i<input.length(); i++){
            answer += Integer.parseInt(Character.toString(input.charAt(i)));
        }
        return answer;
    }
}