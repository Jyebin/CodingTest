class Solution {
    public int solution(int hp) {
        //장군 개미 : 5, 병정 개미 : 3, 일개미 : 1
        //최소한의 병력 구하기
        int first = hp / 5;
        hp = hp % 5;
        int second = hp / 3;
        hp = hp % 3;
        int end = hp;
        int answer = first + second + end;
        return answer;
    }
}