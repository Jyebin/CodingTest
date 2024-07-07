import java.util.*;

class Solution {
    //{상,하,좌,우}
    private static int[] dx = {0,0,-1,1}; //좌,우는 x의 이동
    private static int[] dy = {1,-1,0,0}; //상,하는 y의 이동
    public int solution(int[][] maps) {
        int n = maps.length; //가로 칸의 개수
        int m = maps[0].length; //세로 칸의 개수
        int[][] distance = new int[n][m]; //최단 거리를 저장할 배열
        boolean[][] visited = new boolean[n][m]; //방문 여부를 저장할 배열
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); // 시작점 추가
        visited[0][0] = true;
        distance[0][0] = 1; // 시작점까지의 거리는 1
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int x = now[0]; //x좌표
            int y = now[1]; //y좌표
            
            for(int i=0; i<4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                
                if(newX >= 0 && newY >= 0 && newX < n && newY < m && maps[newX][newY] == 1 && visited[newX][newY] == false){
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = true;
                    distance[newX][newY] = distance[x][y] + 1; //거리 1 증가
                }
            }
        }
        if(distance[n-1][m-1] == 0){
            return -1;
        } else {
            return distance[n-1][m-1];
        }
    }
}
