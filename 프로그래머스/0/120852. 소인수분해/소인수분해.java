import java.util.*;

class Solution {
    public List solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        //작은 수 부터 나누기(2,3,5...)
        for(int i=2; i<=n; i++){
            while(n % i == 0){ //나누어 지면
                set.add(i);
                n = n / i; //나눈 후의 값
            }
        }
        List answer = new ArrayList(set);
        Collections.sort(answer);
        return answer;
    }
}