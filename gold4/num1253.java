package gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //수의 개수
        int goodNumCnt = 0; //좋은 수의 개수
        String[] input = br.readLine().split(" ");
        int[] A = new int[N]; //각각의 수. 위치가 다르면 다른 수
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(A); //투 포인터를 사용하기 위하여 정렬 해 주어야 함

        for (int i = 0; i < N; i++) { //정렬된 배열을 반복
            int target = A[i]; //비교할 수
            int start = 0; //시작 index값
            int end = N - 1; //끝 index 값
            while (start < end) { //배열의 index값을 맨 끝까지 반복
                int sum = A[start] + A[end];
                if (sum == target) { //합계가 비교할 수와 같으면
                    if (start != i && end != i) { //다른 위치의 수라면
                        goodNumCnt++; //count 값 증가
                        break; //이미 합계가 같은 수가 있으므로 더 구할 필요가 없으므로 break
                    } else if (start == i) { //시작 index가 비교해야 할 값의 index와 같다면
                        start++;
                    } else if (end == i) { //끝 index가 비교해야 할 값의 index와 같다면
                        end--;
                    }
                } else if (sum < target) { //합계가 적다면
                    start++; //시작 값(작은 값)을 늘려 합계를 더 크게 함
                } else if (sum > target) { //합계가 더 크다면
                    end--; //끝 값(큰 값)을 줄여 합계를 더 적게 함
                }
            }
        }
        System.out.println(goodNumCnt);
        br.close();
    }
}
