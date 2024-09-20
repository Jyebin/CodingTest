class Solution {
    public int solution(int[] common) {
        //등차인지 등비인지 판별
        int answer = 0;
        int first = common[1] - common[0];
        int sec = common[2] - common[1];
            
        if(first == sec){
            //등차
            answer = common[common.length - 1] + first;
        }else{
            //등비
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }
}