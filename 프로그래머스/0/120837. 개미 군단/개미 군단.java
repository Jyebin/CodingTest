class Solution {
    public int solution(int hp) {
        //장군 : 5, 병정 : 3, 일 : 1
        //적은 병력으로 사냥해야 함
        int answer = hp/5 + (hp%5)/3 + hp%5%3;

        return answer;
    }
}