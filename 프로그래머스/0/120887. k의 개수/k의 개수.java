class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int a=i; a<=j; a++){
            str += a;
        }
        for(int a=0; a<str.length(); a++){
            if(str.charAt(a)-'0' == k){
                answer++;
            }
        }
        return answer;
    }
}