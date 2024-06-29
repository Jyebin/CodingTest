package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class num1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;

        Integer[][] times = new Integer[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            times[i][0] = Integer.parseInt(input[0]); // 시작 시간
            times[i][1] = Integer.parseInt(input[1]); // 종료 시간
        }

        Arrays.sort(times, new Comparator<Integer[]>() { //2차원 배열 times의 각 요소인 Integer[] 비교
            @Override
            public int compare(Integer[] o1, Integer[] o2) { //두 개의 객체를 받아 비교하고 정수 값 반환
                if (o1[1] == o2[1]) { //종료시간이 같으면
                    return Integer.compare(o1[0], o2[0]); //o1과 o2를 비교해서 반환하는 값에 따라 Arrays.sort가 알아서 정렬해줌 -> 어떤 값을 기준으로 정렬할지만 정하면 되는 것
                }
                return o1[1] - o2[1];
            }
        });

        int endtime = times[0][1]; // 첫 번째 회의의 종료 시간
        for (int i = 1; i < N; i++) {
            if (times[i][0] >= endtime) {
                cnt++;
                endtime = times[i][1];
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
