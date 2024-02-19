package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(A); //A를 오름차순으로 정렬

        int M = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[] inputNum = new int[N];
        int isExist = 0;
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(input2[i]);
            if (binarySearch(A, num)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        br.close();
    }


    public static boolean binarySearch(int[] arr, int target) {
        int left = 0; //이분탐색의 시작지점
        int right = arr.length - 1; //이분탐색의 끝 지점
        while (left <= right) {
            int mid = (left + right) / 2; //중간값
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) { //찾고자하는 값이 중간값보다 크면 오른쪽 부분에서 탐색
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

