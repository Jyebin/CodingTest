import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[100000];
        for(int i=0; i<strArr.length; i++){
            int now = strArr[i].length();
            arr[now]++;
        }
        Arrays.sort(arr);
        int answer = arr[arr.length-1];
        return answer;
    }
}