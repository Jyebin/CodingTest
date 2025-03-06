class Solution {
    public int solution(int n) {
        int answer = 0;
        //최종적으로 과거의 숫자에다가 1을 더해서 주어진 수(n)까지 가야 함
        String answerStr = "";
        for(int i=1; i<=n; i++){
            answer = answer + 1;
            answerStr = answer + "";
            //만약 3의 배수이면 1을 더 더함
            while(answer % 3 == 0 || answerStr.contains("3")){ //3의 배수이고 3이라는 숫자가 포함되어 있지 않을 때까지
                answer = answer + 1;
                answerStr = answer + "";
            }
        }
        return answer;
    }
}