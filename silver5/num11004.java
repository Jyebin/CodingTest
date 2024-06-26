package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num11004 {
    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]); //앞에서부터 K번째 있는 수

        String[] input2 = br.readLine().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input2[i]);
        }
        Arrays.sort(nums); //정렬
        System.out.println(nums[K - 1]);

        br.close();
    }
}
