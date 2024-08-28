class Solution {
    public int solution(int order) {
        String ord = order + "";
        //3,6,9 개수만큼 박수
        int answer = 0;
        for(int i=0; i<ord.length(); i++){
            if(ord.charAt(i) == '3' || ord.charAt(i) == '6' ||ord.charAt(i) == '9'){
                answer ++;
            }
        }
        return answer;
    }
}