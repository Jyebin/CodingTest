import java.util.Scanner;

public class num1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] numWhoLeft = new int[N + 1]; // 왼쪽에 몇 명이 있는지

        for (int i = 1; i <= N; i++) {
            numWhoLeft[i] = Integer.parseInt(input[i - 1]); //input값은 인덱스가 0부터 시작함
        }

        int[] result = new int[N + 1]; // 최종적으로 줄을 선 순서
        for (int i = 1; i <= N; i++) { //i번째 사람에 대한 작업 수행
            int numLeft = numWhoLeft[i]; // i번째 사람의 왼쪽에 몇 명이 있는지
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (count == numLeft && result[j] == 0) { //왼쪽에 사람이 있는 개수를 count에 저장해놓고, 1씩 증가시켜 result가 비어 있는 경우 i를 대입
                    result[j] = i;
                    break;
                }
                if (result[j] == 0) {
                    count++;
                }
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            resultBuilder.append(result[i]).append(" ");
        }
        if (resultBuilder.length() > 0) {
            resultBuilder.setLength(resultBuilder.length() - 1);
        }
        System.out.println(resultBuilder);
    }
}