package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사진틀의 개수(추천 학생 수와 동일)
        int M = Integer.parseInt(br.readLine()); // 전체 학생의 총 추천 횟수
        String[] input = br.readLine().split(" "); // 추천받은 학생을 나타내는 번호
        int length = input.length;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) { // 추천받은 학생
            nums[i] = Integer.parseInt(input[i]);
        }
        if (M > 1000) {
            throw new IOException("총 추천 횟수는 1,000번 이하여야 합니다.");
        }
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] > 100 || nums[i] < 1) {
                throw new IOException("추천 학생 번호는 1부터 100까지의 자연수여야 합니다.");
            }
        }
        int[] frame = new int[N];
        Arrays.fill(frame, -1); // 프레임을 전부 -1로 초기화
        int[] recommendCnt = new int[101]; // 추천수를 저장할 배열. 학생 수는 100명임
        int[] time = new int[101]; // 학생이 프레임에 올라간 시간을 저장할 배열
        int currentTime = 0; // 현재 시간

        for (int i = 0; i < length; i++) {
            int student = nums[i]; // 현재 학생
            boolean inFrame = false;

            // 이미 frame에 있는지를 확인하고 추천 수를 증가시킴
            for (int j = 0; j < N; j++) { // 사진틀만큼 반복
                if (frame[j] == student) { // 학생이 이미 프레임에 있으면 추천 수 증가
                    recommendCnt[student]++;
                    inFrame = true;
                    break;
                }
            }

            if (!inFrame) { // 학생이 frame 안에 없으면
                boolean added = false;
                for (int j = 0; j < N; j++) { // 비어 있는 프레임을 찾음
                    if (frame[j] == -1) { // 비어 있는 경우
                        frame[j] = student; // 비어 있는 칸에 학생을 넣음
                        recommendCnt[student] = 1; // 현재 학생의 추천 수를 초기화
                        time[student] = currentTime++; // 현재 시간을 저장
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    // 교체할 학생을 찾음 (추천 수가 가장 적고, 같은 경우 가장 오래된 학생)
                    int minRecommend = Integer.MAX_VALUE;
                    int minTime = Integer.MAX_VALUE;
                    int minIndex = -1;

                    for (int j = 0; j < N; j++) {
                        int currentStudent = frame[j]; //현재 프레임에 있는 학생
                        if (recommendCnt[currentStudent] < minRecommend || //추천수가 같은 것이 없거나
                                (recommendCnt[currentStudent] == minRecommend && time[currentStudent] < minTime)) { //추천수가 같은 것이 있으면 더 오래된 시간(여기서는 더 전에 저장된 것이 숫자가 더 작음)
                            minRecommend = recommendCnt[currentStudent];
                            minTime = time[currentStudent];
                            minIndex = j; //교체할 학생의 위치
                        }
                    }

                    if (minIndex != -1) { //교체할 학생의 위치가 있으면
                        int removedStudent = frame[minIndex]; //교체할 학생
                        frame[minIndex] = student; // 새로운 학생으로 교체(현재 학생으로)
                        recommendCnt[student] = 1; // 새로 추가된 학생의 추천 수 초기화
                        time[student] = currentTime++; // 현재 시간을 저장
                        recommendCnt[removedStudent] = 0; // 제거된 학생의 추천 수 초기화
                    }
                }
            }
        }

        Arrays.sort(frame); //오름차순 정렬
        for (int i = 0; i < N; i++) {
            if (frame[i] != -1) {
                System.out.print(frame[i] + " ");
            }
        }
    }
}
