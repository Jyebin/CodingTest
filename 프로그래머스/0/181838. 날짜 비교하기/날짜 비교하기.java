class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 1;
        if(date1[0] > date2[0]){ //앞에꺼의 연도가 더 크면
            answer = 0;
        }else if(date1[0] == date2[0]){ //연도가 같으면
            if(date1[1] > date2[1]){
                answer = 0;
            }else if(date1[1] == date2[1]){
                if(date1[2] >= date2[2]){
                    answer = 0;
                }
            }
        }
        return answer;
    }
}