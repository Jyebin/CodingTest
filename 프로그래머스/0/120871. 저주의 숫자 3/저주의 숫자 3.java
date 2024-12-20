class Solution {
    public int solution(int n) {
        int answer = 0;
        //3의 배수가 나오면 그 숫자 + 1
        //숫자는 계속 1씩 더해주어야 함 -> for문을 통해서 1씩 더해주고, 조건에 맞으면 1을 더 더해줌
        for(int i=0; i<n; i++){
            answer = answer + 1;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer = answer + 1;
            }
        }
        return answer;
    }
}