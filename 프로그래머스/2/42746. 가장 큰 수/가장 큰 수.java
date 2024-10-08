import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        boolean isZero = true;
        for(int i=0; i<numbers.length; i++){
            arr[i] = numbers[i] + "";
            if(!arr[i].equals("0")){
                isZero = false;
            }
        }
        //문자열 두 개를 이어 붙인 수를 오름차순 정렬
        Arrays.sort(arr, new Comparator<String>(){
           @Override
            public int compare(String o1, String o2){ 
                return Integer.parseInt(o2+o1) - Integer.parseInt(o1+o2);
            }
        });
        for(int i=0; i<numbers.length; i++){
            answer += arr[i];
            if(isZero){
                answer = "0";
            }
        }
        return answer;
    }
}