class Solution {
    public String solution(String bin1, String bin2) {
        //이진수의 합 return
        //이진수를 10진수로 변환한 후 다시 이진수로 변환
        int num1 = Integer.valueOf(bin1, 2); //2진수를 10진수로 변환
        int num2 = Integer.valueOf(bin2, 2);
        int sum = num1 + num2;
        String answer = Integer.toBinaryString(sum); //10진수를 2진수로 변환
        return answer;
    }
}