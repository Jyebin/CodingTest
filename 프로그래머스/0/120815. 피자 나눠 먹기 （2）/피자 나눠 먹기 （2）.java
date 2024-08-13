class Solution {
    public int solution(int n) {
        int answer = 0;
        //피자를 여섯 조각으로 자름
        //n : 나눠먹을 사람의 수
        //n명이 같은 수의 피자를 먹어야 함
        for(int i=1; i<=100; i++){
            int pazza = 6 * i; //피자 조각의 개수. i는 피자의 판수
            if(pazza % n == 0){ //피자 조각이 6의 배수여야 함
                answer = i;
                break;
            }
        }
        return answer;
    }
}