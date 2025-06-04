import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        //A와 B를 정렬해서 비교
        Arrays.sort(A);
        Arrays.sort(B);
        int idxA = 0;
        int idxB = 0;
        
        while (idxA < A.length && idxB < B.length){
            if(B[idxB] > A[idxA]){ //B가 이기면 A를 다음 사람으로
                idxA ++;
                answer ++;
            }
            idxB ++;
        }
        return answer;
    }
}