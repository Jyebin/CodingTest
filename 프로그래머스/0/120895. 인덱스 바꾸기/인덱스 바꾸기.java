class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split(""); //빈칸도 나눠져서 배열의 각 방에 들어감
        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}