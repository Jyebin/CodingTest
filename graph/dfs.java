package graph;

import java.util.ArrayList;

public class dfs {
    private static ArrayList<Integer>[] adjList; // 인접 리스트를 저장할 배열
    private static boolean[] visited; // 방문 여부를 저장할 배열
    private static ArrayList<Integer> answer;

    public static void main(String[] args) {
        //그래프의 각 노드에 연결된 노드들을 저장하는 인접 리스트
        int V = 5; // 정점의 개수
        adjList = new ArrayList[V]; //각 노드에 대한 인접 리스트를 저장할 배열. 배열의 크기는 정점의 개수
        visited = new boolean[V];
        answer = new ArrayList<>();

        // 인접 리스트 초기화
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 간선 추가
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
        addEdge(3, 4);

        // DFS 수행
        dfs(2); // 시작 노드를 2로 설정

        // 결과 출력
        System.out.println("DFS 결과 : " + answer);
    }

    private static void addEdge(int v, int w) {
        adjList[v].add(w); // v -> w 간선 추가
    }

    private static void dfs(int now) {
        visited[now] = true; // 현재 노드를 방문했음을 저장
        answer.add(now); // 현재 노드를 결과 리스트에 추가

        // 현재 노드와 인접한 노드 순회
        for (int i = 0; i < adjList[now].size(); i++) {
            int next = adjList[now].get(i);
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

