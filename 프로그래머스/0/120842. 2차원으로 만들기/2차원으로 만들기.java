class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num = num_list.length / n;
        int[][] answer = new int[num][n];
        //n개씩 배열에 넣기
        int a = 0; //새로운 변수를 만들어 num_list에 접근
        int len = num_list.length;
        for(int i=0; i<len/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[a];
                a++;
            }
        }
        return answer;
    }
}