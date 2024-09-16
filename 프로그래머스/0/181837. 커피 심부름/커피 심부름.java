class Solution {
    public int solution(String[] order) {
        //ice가 들어가면 아이스, hot이 들어가면 hot
        int answer = 0;
        for(int i=0; i<order.length; i++){
            String now = order[i];
            if(now.contains("cafelatte")){
                answer += 5000;
            }else{
                answer += 4500;
            }
        }
        return answer;
    }
}