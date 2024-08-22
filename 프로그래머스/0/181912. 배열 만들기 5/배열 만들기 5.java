import java.util.*;

class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        int len = intStrs.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            String[] arr = intStrs[i].split(""); //배열 안에 있는 요소를 한글자씩 분리해서 새 배열 생성
            String result = "";
            for(int j=s; j<s+l; j++){ //범위
                result = result + arr[j];
                if(Integer.parseInt(result) > k){
                    list.add(Integer.parseInt(result));
                }
            }
        }
        return list;
    }
}