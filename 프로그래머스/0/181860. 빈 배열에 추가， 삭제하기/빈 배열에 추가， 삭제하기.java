import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i] == true){
                for(int j=0; j<arr[i]*2; j++){
                    X.add(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                    X.remove(X.size()-1);
                }
            }
        }
        return X;
    }
}