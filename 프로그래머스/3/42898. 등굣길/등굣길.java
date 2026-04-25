class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n][m];
        
        for(int i=0; i<puddles.length; i++){
            int x = puddles[i][0]-1;
            int y = puddles[i][1]-1;
            
            dp[y][x] = -1;
        }
        dp[0][0] = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0){
                    continue;
                }
                if(dp[i][j]==-1){
                    continue;
                }
                    int up = 0;
                    int left = 0;
                    
                    if(i>0 && dp[i-1][j] != -1){ //위에칸이 물웅덩이가 아니어야 경로를 가져옴
                        up = dp[i-1][j];
                    }
                    if(j>0 && dp[i][j-1] != -1){
                        left = dp[i][j-1];
                    }
                    dp[i][j] = (left + up) % 1000000007;
                
            }
        }
        return dp[n-1][m-1];
    }
}