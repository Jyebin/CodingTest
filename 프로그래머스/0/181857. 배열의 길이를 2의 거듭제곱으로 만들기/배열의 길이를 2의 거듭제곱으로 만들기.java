import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        //arr의 길이가 2의 정수 거듭제곱 -> 2로 계속 나눴을 때 몫이 1이 되면 됨
        //Arrays.copyOf() : 남은 배열의 크기는 0으로 채움
        int len = 1;
        while(len < arr.length){
            len *= 2;
        }
        return Arrays.copyOf(arr,len);
    }
}