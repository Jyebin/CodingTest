class Solution {
    public int[] solution(int money) {
        //아아 : 5500
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}