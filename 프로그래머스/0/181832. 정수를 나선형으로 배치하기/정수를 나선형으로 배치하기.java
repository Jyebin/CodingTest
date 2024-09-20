import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        boolean[][] visited = new boolean[n][n];
        int x = 0;
        int y = 0;
        int num = 1;
        int way = 0;
        int[][] answer = new int[n][n];
        while(num <= Math.pow(n,2)){
            answer[x][y] = num;
            visited[x][y] = true;
            if(x + dx[way] < 0 || x + dx[way] >= n || y + dy[way] < 0 || y + dy[way] >= n || visited[x+dx[way]][y+dy[way]]==true){
                way++;
                way %= 4;
            }
            //위의 조건을 모두 통과하는 경우에만 이동
            x = x + dx[way];
            y = y + dy[way];
            num++;
        }

        return answer;
    }
}