class Solution {
    public int solution(int slice, int n) {
        //slice : 피자 조각 수
        //n : 피자를 먹는 사람의 수
        //최소 한 조각 이상 먹으려면 -> n보다는 커야 함
        int answer = 0;
        if(n % slice == 0){
            answer = n / slice;
        }else{
            answer = n / slice + 1;
        }
        return answer;
    }
}