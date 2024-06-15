package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //재료의 개수
        int M = Integer.parseInt(br.readLine()); //갑옷을 만드는 데 필요한 수
        String[] input = br.readLine().split(" ");
        int[] materials = new int[N]; //재료들이 가진 고유한 번호

        for (int i = 0; i < N; i++) {
            materials[i] = Integer.parseInt(input[i]);
        }

        int cnt = 0;
        Arrays.sort(materials); //투포인터를 사용하기 위하여 정렬

        int start = 0; //시작 index
        int end = N - 1; //끝 index

        while (start < end) {
            int sum = materials[start] + materials[end];
            if (sum == M) { //합계과 M과 같으면
                cnt++; //횟수 증가
                start++;
                end--;
            } else if (sum < M) { //합계가 더 작으면 시작 값을 늘려 합계가 커지도록 함
                start++;
            } else if (sum > M) { //합계가 더 크면 끝 값을 줄여 합계가 작아지도록 함
                end--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
