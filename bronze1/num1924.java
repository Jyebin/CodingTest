package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Jan = 0; // 0일부터 31일까지는 1월
        int Feb = 31 + Jan; // 31일부터는 2월
        int March = 28 + Feb;
        int April = 31 + March;
        int May = 30 + April;
        int June = 31 + May;
        int July = 30 + June;
        int Aug = 31 + July;
        int Sep = 31 + Aug;
        int Oct = 30 + Sep;
        int Nov = 31 + Oct;
        int Dec = 30 + Nov;
        int sum;
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        if (x == 1) {
            sum = Jan + y;
        } else if (x == 2) {
            sum = Feb + y;
        } else if (x == 3) {
            sum = March + y;
        } else if (x == 4) {
            sum = April + y;
        } else if (x == 5) {
            sum = May + y;
        } else if (x == 6) {
            sum = June + y;
        } else if (x == 7) {
            sum = July + y;
        } else if (x == 8) {
            sum = Aug + y;
        } else if (x == 9) {
            sum = Sep + y;
        } else if (x == 10) {
            sum = Oct + y;
        } else if (x == 11) {
            sum = Nov + y;
        } else {
            sum = Dec + y;
        }
        switch (sum % 7) { //백준에서는 향상된 switch문을 지원 안해서 컴파일 에러 발생
            case 1:
                System.out.print("MON");
                break;
            case 2:
                System.out.print("TUE");
                break;
            case 3:
                System.out.print("WED");
                break;
            case 4:
                System.out.print("THU");
                break;
            case 5:
                System.out.print("FRI");
                break;
            case 6:
                System.out.print("SAT");
                break;
            case 0:
                System.out.print("SUN");
                break;
        }
        br.close();
    }
}
