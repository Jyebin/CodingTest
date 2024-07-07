import java.util.*;

class Solution {
    private static boolean[] visited; //각 컴퓨터를 방문했는지 아닌지를 판단
    private static int[][] computer;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n]; //방문 여부를 저장할 배열
        computer = computers; //컴퓨터를 저장할 배열
        for(int i=0;i<n;i++){ //컴퓨터의 개수만큼 반복
            if(!visited[i]){ //방문하지 않은 컴퓨터라면
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    private static void dfs(int now){
        visited[now] = true;
        for(int i=0;i<computer[now].length;i++){
            if(computer[now][i] == 1 && !visited[i]){ //컴퓨터에 회선이 있고 방문하지 않은 회선이라면
                dfs(i);                
            }
        }
    }
}