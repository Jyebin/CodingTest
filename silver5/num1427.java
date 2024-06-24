package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class num1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split("");
        Arrays.sort(input, Collections.reverseOrder());
        for(int i=0;i<input.length;i++){
            sb.append(input[i]);
        }
        System.out.println(sb);
        br.close();
    }
}
