import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[][] maps) {
        //최단거리 찾기 -> bfs -> Queue
        //동, 서, 남, 북 한 칸
        //0이 벽이 있는 자리, 1이 없는 자리 -> 1로만 가야 함
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int[][] dist = new int[maps.length][maps[0].length]; //각 칸별 최단거리
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length){
                    continue;
                }
                
                if(maps[nx][ny] == 0 || visited[nx][ny]){
                    continue;
                }
                
                queue.add(new int[]{nx, ny});
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
        if (dist[maps.length - 1][maps[0].length - 1] == 0) {
            return -1;
        } else {
            return dist[maps.length - 1][maps[0].length - 1];
        }
    }
}