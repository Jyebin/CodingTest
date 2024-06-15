package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class num28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //명령의 수
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" "); //명령
            int order = Integer.parseInt(input[0]); //명령의 종류

            switch (order) {
                case 1:
                    int num = Integer.parseInt(input[1]); //스택에 넣을 수
                    stack.push(num);
                    break;
                case 2:
                    if (stack.isEmpty()) { //스택이 비어 있으면
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n"); //맨 위의 정수 출력 후 제거
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty()) { //스택이 비어 있으면
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) { //스택이 비어있지 않다면
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}
