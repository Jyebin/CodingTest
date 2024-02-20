package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num15651 {
    public static int N;
    public static int M;
    public static int[] result;
    public static StringBuilder sb = new StringBuilder();
    //print문은 문자열을 변경할 때마다 새로운 String 객체를 생성하여 메모리를 할당하였음
    //StringBuilder는 내부 버퍼를 사용하여 문자열을 한번에 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); //수열의 끝
        M = Integer.parseInt(input[1]); //수열의 길이
        result = new int[M];
        dfs(0); //숫자가 아무것도 선택되지 않은 상태
        System.out.println(sb.toString()); //객체 sb에 저장된 문자열을 출력
        br.close();
    }

    public static void dfs(int depth) { //depth : 현재까지 선택한 숫자의 개수
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" "); //객체 sb에 result를 문자열로 변환해 누적한 후 공백을 추가
                //append는 객체에 문자열이나 다른 데이터를 누적하는 역할을 함
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            result[depth] = i;
            dfs(depth + 1);
        }
    }
}
