class Solution {
    public int solution(int n) {
        //피자는 무조건 7조각
        //n : 나눠먹을 사람의 수
        int answer = 0;
        
        if(n%7 == 0){
            answer = n/7;
        }else{
            answer = n/7 + 1;
        }
        return answer;
    }
}