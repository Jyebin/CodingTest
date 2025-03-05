class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double number : numbers){
            answer = answer + number;
        }
        
        return answer/numbers.length;
    }
}