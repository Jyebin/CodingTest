class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        //현재 원소를 기준으로 계속 나눠주면 됨 -> 전체 나누는 횟수를 구하기 때문에 answer 초기화 필요 X
        for(int i=0; i<num_list.length; i++){
            while(num_list[i] != 1){
                if(num_list[i] == 1){
                    break;
                }
                if(num_list[i]%2 == 0){
                    answer++;
                    num_list[i] = num_list[i]/2;
                }else{
                    answer++;
                    num_list[i] = (num_list[i]-1)/2;
                }
            }
        }
        return answer;
    }
}