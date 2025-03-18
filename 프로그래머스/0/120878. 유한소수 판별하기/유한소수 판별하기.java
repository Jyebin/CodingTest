class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        //소수점 아래 숫자가 계속되지 않고 유한개인 것
        // 분모의 소인수가 2와 5만 있어야 함
        //1. 기약분수로 만들기
        //2. 분모가 2나 5인지 확인
        
        int A = Math.max(a, b); //더 큰 수
        int B = Math.min(a, b); //더 작은 수
        //최대공약수 구하는 법 : 큰 수 % 작은 수를 계속 반복 -> 나머지가 0이 되면 그것이 최대공약수
        
        while(B != 0){
            int r = A % B;
            A = B;
            B = r;
        }
        
        int child = a / A;
        int mom = b / A; //분모를 최대공약수로 나눔
        
        //최대공약수로 나눈 후의 분모의 기약수가 2나 5여야 함
        
        while(mom % 2 == 0){
            mom = mom / 2;
        }
        while(mom % 5 == 0){
            mom = mom / 5;
        }
        if(mom == 1){
            answer = 1;
        }
        return answer;
    }
}