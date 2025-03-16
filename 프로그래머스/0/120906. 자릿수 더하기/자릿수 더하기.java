class Solution {
    public int solution(int n) {
        //n의 각 자리 숫자의 합 return
        int answer = 0;
        String nStr = n + "";
        String[] arr = nStr.split("");
        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}