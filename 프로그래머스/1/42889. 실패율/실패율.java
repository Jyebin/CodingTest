import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int length = stages.length; // 전체 도전자 수
        int[] arr = new int[N + 1]; // 다음 스테이지에 도전하는 경우도 따져 주어야 함

        for (int i = 0; i < length; i++) {
            if (stages[i] <= N) {
                arr[stages[i] - 1] += 1; // stages[i]번째 요소를 index로 해서 index가 나오면 그 방에 가서 1 더해주기
            }
        }

        int total = length;
        // 실패율 = 클리어 못함 / 각 스테이지 도전
        // 각 배열에서의 전체 개수
        double[] rate = new double[N]; // 실패율을 저장할 배열
        for (int i = 0; i < N; i++) {
            // rate[stage] = 실패율
            if (arr[i] == 0) { // 실패율이 0인 경우
                rate[i] = 0.0;
            } else {
                double percent = (double) arr[i] / total;
                total -= arr[i];
                rate[i] = percent;
            }
        }

        int[] answer = new int[N]; // 정답(index를 저장해 줄 배열)

        // percent(rate의 값)를 기준으로 정렬
        for (int i = 0; i < N; i++) {
            double max = -1;
            int target = 0;

            for (int j = 0; j < N; j++) {
                if (rate[j] > max) { // 최대보다 크면
                    max = rate[j];
                    target = j + 1; // index는 0번부터 시작이므로 1 더해줘야 함
                }
            }
            rate[target - 1] = -1; // 그 다음 최대값을 구하기 위함
            answer[i] = target;
        }
        return answer;
    }
}
