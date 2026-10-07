import java.util.Arrays;

class Solution {
    public String solution(String s) {
        //s에 나타나는 문자를 내림차순으로 정렬
        String[] arr = s.split("");
        Arrays.sort(arr, (a,b) -> b.compareTo(a));
        StringBuilder sb = new StringBuilder();
        for(String n:arr){
            sb.append(n);
        }
        return sb.toString();
    }
}