package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class num1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int currentNum = 1; //현재 stack에 넣어야 할 숫자
        boolean possible = true; //수열을 만들 수 있는지 여부

        for (int i = 1; i <= n; i++) { //i값을 가지고 원래 있는 수열과 비교
            int num = Integer.parseInt(br.readLine()); //숫자를 입력받음
            while (currentNum <= num) { //넣어야 하는 숫자가 입력받은 숫자보다 같아질 까지
                stack.push(currentNum); //스택에 숫자를 넣음
                sb.append("+").append("\n"); //+추가
                currentNum++;
            }
            if (stack.peek() == num) { //스택의 최상단 요소가 입력받은 숫자와 같으면
                stack.pop(); //스택에서 제거
                sb.append("-").append("\n");
            } else {
                possible = false;
                break;
            }
        }
        if (possible) {
            System.out.println(sb); //출력
        } else {
            System.out.println("NO");
        }
        br.close();
    }
}
