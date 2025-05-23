class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int first = 0;
        int second = 0;
        for(int width = 3; width <= total / 3; width ++){
            int height = total / width;
            if((width - 2) * (height - 2) == yellow){
                first = Math.max(width, height);
                second = Math.min(width, height);
            }
        }
        int[] answer = {first, second};
        return answer;
    }
}