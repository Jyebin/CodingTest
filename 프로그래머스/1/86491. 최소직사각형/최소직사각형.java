class Solution {
    public int solution(int[][] sizes) {
        //모든 명함을 수납할 수 있는 가장 작은 지갑 만들기
        //가로,세로 값 바꿔도 됨
                
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int maxHeight = sizes[0][0]; //가로
        int maxWidth = sizes[0][1]; //세로
        
        for(int i=1; i<sizes.length; i++){
            maxHeight = Math.max(maxHeight, sizes[i][0]);
            maxWidth = Math.max(maxWidth, sizes[i][1]);
        }
        
        int answer = maxWidth * maxHeight;
        return answer;
    }
}