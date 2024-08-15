import java.math.*;

class Solution {
    public int solution(int n) {
        //두 숫자의 곱이 n이어야 함
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
        }
       
        return cnt;
    }
}