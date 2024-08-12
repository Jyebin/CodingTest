class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = denom1 * numer2 + denom2 * numer1; //분자
        int denom = denom1 * denom2; //분모
        int max = 1; //max값으로 나누므로 0이 될 수 없음
        
        for(int i=1; i<=numer && i<=denom; i++){
            if(numer % i == 0 && denom % i == 0){ //두 수로 나누어 떨어지는 수가 존재하면
                max = i; //for문을 끝까지 돌리므로 조건에 맞는 가장 큰 i값이 들어갈 것
            }
        }
        numer = numer / max;
        denom = denom / max;
        
        int[] answer = {numer, denom};
        return answer;
    }
}