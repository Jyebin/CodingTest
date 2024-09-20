class Solution {
    public long[] solution(int x, int n) {
        //x부터 시작해 x씩 증가하는 숫자를 n개 지남
        long[] answer = new long[n];
        long num = x;
        for(int i=0; i<n; i++){
            answer[i] = num;
            num = num + x;
        }
        return answer;
    }
}