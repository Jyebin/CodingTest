import java.util.HashSet;

class Solution {
    public int solution(int N, int number) {
        //number를 만드는 데 N을 몇 번 쓸 수 있는지를 return
        //HashSet dp를 만들어서 해결, set 안에 숫자가 있으면 return
        HashSet<Integer>[] dp = new HashSet[9]; //최대 8개까지 이용 가능
        for(int i=1; i<9; i++){ //i가 숫자 몇 개 이용했는지
            dp[i] = new HashSet<>();
        }
        
        for(int i=1; i<9; i++){
            //이어붙인 숫자
            int num = 0;
            for(int j=0; j<i; j++){
                num = num * 10 + N; //한줄씩 이어붙여야됨
            }
            dp[i].add(num); //이어붙인 숫자 넣기
            
            //사칙연산(i개로 만든 숫자 + i-j개로 만든 숫자 사칙연산으로 조합)
            for(int j=1; j<i; j++){
                for(int a : dp[j]){
                    for(int b : dp[i-j]){
                        dp[i].add(a+b);
                        dp[i].add(a-b);
                        if(b!=0){
                            dp[i].add(a/b);
                        }
                        dp[i].add(a*b);
                    }
                }
            }
            if(dp[i].contains(number)){
                return i;
            }
        }
        return -1;
    }
}