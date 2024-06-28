package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //식 : 0~9, -으로만 이루어짐
        //최소값을 만들어야 함
        //가장 많이 더해서 빼야 함
        //주어진 숫자에서 -부분 이후 값을은 다 더해주어야 함
        int result = 0;
        String[] front = br.readLine().split("-"); //-앞까지의 수
        for (int j = 0; j < front.length; j++) { //-뒷부분
            int total = 0; //뒷부분의 합
            String[] back = front[j].split("\\+"); //+는 특수문자이므로 이스케이프 처리를 해 주어야 함. 역슬래시도 이스케이프 문자이므로 두 개를 사용해서 표현해 주어야 함
            for (int i = 0; i < back.length; i++) {
                total = total + Integer.parseInt(back[i]); //뒷부분의 합
            }
            if (j == 0) {
                result = result + total; //맨 앞의 숫자는 더해줌
            } else {
                result = result - total;
            }
        }
        System.out.println(result);
        br.close();
    }
}
