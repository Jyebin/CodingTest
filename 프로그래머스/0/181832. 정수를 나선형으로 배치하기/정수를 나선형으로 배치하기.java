class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; //배치할 숫자
        int rowStart = 0; //행(가로)
        int rowEnd = n-1;
        int colStart = 0; //열(세로)
        int colEnd = n-1;
        //처음에는 오른쪽 끝까지 이동
        while(rowStart <= rowEnd && colStart <= colEnd){ //아직 채우지 않은 행과 열이 있는지 판단
            for(int i=colStart; i<=colEnd; i++){ //세로꺼를 하나하나 채워야 함
                answer[rowStart][i] = num++; //0번째 행
            }
            rowStart++; //행 증가
            
            for(int i=rowStart; i<=rowEnd; i++){
                answer[i][colEnd] = num++; //맨 마지막 가로줄 하나씩 채우기
            }
            colEnd --; //한 칸 왼쪽으로
            
            if(rowStart <= rowEnd){
                for(int i=colEnd; i>=colStart; i--){
                    answer[rowEnd][i] = num++; //세로 채우기
                }
                rowEnd --; //한 칸 오른쪽으로
            }
            
            if(colStart <= colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    answer[i][colStart] = num++; //가로 채우기
                }
                colStart ++;
            }
        }
        return answer;
    }
}