import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a,b) -> { //정렬을 해야 함
            //뒤에꺼가 더 크면 그냥 놔두기
            if(a.charAt(n) - b.charAt(n) < 0){
                return -1;
            } else if(a.charAt(n) == b.charAt(n)){ //같으면 맨 앞부터 문자열 비교
                return a.compareTo(b); //오름차순 정렬
            } else { //뒤에꺼가 더 작으면 자리 바꾸기 -> 양수
                return 1;
            }
        });
        
        return strings;
    }
}