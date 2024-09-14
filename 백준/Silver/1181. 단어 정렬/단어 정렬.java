

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = "";
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
