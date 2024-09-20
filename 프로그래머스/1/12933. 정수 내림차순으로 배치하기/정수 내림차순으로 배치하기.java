import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String ans = "";
        for(int i=0; i<arr.length; i++){
            ans += arr[i];
        }
        return Long.parseLong(ans);
    }
}