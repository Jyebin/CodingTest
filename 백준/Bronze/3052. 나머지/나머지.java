
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[42];

        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            int idx = input % 42;
            result[idx]++;
        }
        int sum = 0;
        for (int i = 0; i < 42; i++) {
            if (result[i] != 0) {
                sum++;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
