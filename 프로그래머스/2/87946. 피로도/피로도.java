class Solution {
    boolean[] visited;
    int maxCnt;
    public int solution(int k, int[][] dungeons) {
        int answer = -1; 
        for(int i=0; i<dungeons.length; i++){ //맨 첫번째 탐색할 던전
            visited = new boolean[dungeons.length];
            if(k >= dungeons[i][0]){ //현재 체력이 다음 던전 때 필요한 최소 체력보다 크면
                visited[i] = true; //방문 처리
                dfs(k - dungeons[i][1], dungeons, 1); //탐색 후 남은 체력, 던전 전체(순서가 없으므로 전체를 넘겨줘야 함), 현재 하나 탐색했으므로 1
                visited[i] = false; //다른 순서도 고려할 수 있도록 방문 처리 초기화
            }
        }
        answer = maxCnt;
        return answer;
    }
    void dfs(int stamina, int[][] dungeons, int cnt){
        maxCnt = Math.max(maxCnt, cnt);
        for(int i=0; i<dungeons.length; i++){ //선택한 다음 던전
            if(stamina >= dungeons[i][0] && !visited[i]){ //현재 체력이 다음 던전 때 필요한 최소 체력보다 크면
                visited[i] = true; //방문 처리
                dfs(stamina - dungeons[i][1], dungeons, cnt + 1);
                visited[i] = false;
            }
        }
    }
}