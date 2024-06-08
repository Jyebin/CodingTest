package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //자연수
        int start = 0; //시작 index
        int end = 0; //끝 index
        int total = 0; //합계
        int result = 0; //합이 같은 경우의 횟수

        while(end <= N){
            if(total == N){ //합계가 같으면
                result ++; //횟수 1 증가
                end ++; //끝부분을 1 증가시켜 다음 요소들 판별할 수 있도록 함
                total = total + end;
            }else if(total < N){
                end ++;
                total = total + end;
            }else if(total > N){
                total = total - start;
                start++;
            }
        }
        System.out.println(result);
    }
}
