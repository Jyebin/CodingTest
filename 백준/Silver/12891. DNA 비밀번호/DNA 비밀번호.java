
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s = Integer.parseInt(input[0]); // 전체 문자열 길이
        int p = Integer.parseInt(input[1]); // 비밀번호로 사용할 부분 문자열 길이
        String dna = br.readLine();
        String[] nums = br.readLine().split(" ");
        int aCnt = Integer.parseInt(nums[0]);
        int cCnt = Integer.parseInt(nums[1]);
        int gCnt = Integer.parseInt(nums[2]);
        int tCnt = Integer.parseInt(nums[3]);
        int cnt = 0;

        int[] currentCount = new int[4];

        for (int i = 0; i < p; i++) {
            char ch = dna.charAt(i);
            if (ch == 'A') currentCount[0]++;
            if (ch == 'C') currentCount[1]++;
            if (ch == 'G') currentCount[2]++;
            if (ch == 'T') currentCount[3]++;
        }

        // 첫 번째 윈도우가 조건을 만족하는지 확인
        if (currentCount[0] >= aCnt && currentCount[1] >= cCnt && currentCount[2] >= gCnt && currentCount[3] >= tCnt) {
            cnt++;
        }

        // 슬라이딩 윈도우로 나머지 부분 문자열 검사
        for (int i = p; i < s; i++) {
            // 윈도우에서 벗어나는 문자 제거
            char chOut = dna.charAt(i - p);
            if (chOut == 'A') currentCount[0]--;
            if (chOut == 'C') currentCount[1]--;
            if (chOut == 'G') currentCount[2]--;
            if (chOut == 'T') currentCount[3]--;

            // 윈도우에 새로 들어오는 문자 추가
            char chIn = dna.charAt(i);
            if (chIn == 'A') currentCount[0]++;
            if (chIn == 'C') currentCount[1]++;
            if (chIn == 'G') currentCount[2]++;
            if (chIn == 'T') currentCount[3]++;
            
            if (currentCount[0] >= aCnt && currentCount[1] >= cCnt && currentCount[2] >= gCnt && currentCount[3] >= tCnt) {
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}
