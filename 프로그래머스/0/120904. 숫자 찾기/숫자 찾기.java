class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numStr = num + "";
        String[] input = numStr.split("");
        for(int i=0; i<input.length; i++){
            if(Integer.parseInt(input[i]) == k){
                answer = i+1; //자릿수이므로 index + 1
                break; //가장 처음으로 나타나는 자리 return
            }
        }
        return answer;
    }
}