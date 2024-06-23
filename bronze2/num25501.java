package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num25501 {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            cnt = 0;
            String input = br.readLine();
            int result = isPalindrome(input);
            System.out.println(result + " " + cnt);
        }
        br.close();
    }

    public static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r) { // 홀수: 중앙에 도달(l==r), 짝수: l은 커지고 r은 작아짐(l > r)
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else { // 왼쪽 인덱스와 오른쪽 인덱스의 문자가 같으면
            return recursion(s, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}
