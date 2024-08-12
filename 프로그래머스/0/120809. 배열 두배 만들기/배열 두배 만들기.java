class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        for(int i=0; i<length; i++){
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}