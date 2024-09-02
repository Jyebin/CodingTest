import java.util.*;

class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> X = new ArrayList<>(); //빈 배열
        for(int i=0; i<arr.length; i++){
            int now = arr[i];
            for(int j=0; j<now; j++){
                X.add(now);
            }
        }
        return X;
    }
}