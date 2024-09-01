class Solution {
    public int[] solution(String myString) {
        String[] input = myString.split("x",myString.length());
        int[] answer = new int[input.length];
        for(int i=0; i<input.length; i++){
            System.out.println(input[i]);
            answer[i] = input[i].length();
        }
        return answer;
    }
}