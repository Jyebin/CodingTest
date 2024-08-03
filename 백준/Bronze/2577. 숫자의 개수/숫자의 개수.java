
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int product = A * B * C;
        String proStr = String.valueOf(product);
        int[] nums = new int[10]; //0부터 9까지 숫자 빈도를 저장

        for (int i = 0; i < proStr.length(); i++) {
            int digit = proStr.charAt(i) - '0';
            nums[digit]++;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
