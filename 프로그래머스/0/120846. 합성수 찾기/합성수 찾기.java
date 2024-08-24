class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){ //n이하의 모든 수를 돌며
            int diviCnt = 0; //약수의 개수
            for(int j=1; j<=n; j++){ //n이하의 숫자의 약수의 개수 찾기
                if(i % j == 0){
                    diviCnt++;
                }
            }
            if(diviCnt >= 3){
                answer ++;
            }
        }
        return answer;
    }
}