import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList solution(String[] files) {
        //string으로 정렬하면 안되니까 숫자는 int로 정렬 ?
        //HEAD: 문자로 구성
        //NUMBER: 숫자로 구성, 0이 올 수도 있음
        //TAIL: 숫자나 아무것도 없음
        
        //HEAD를 기준으로 사전 순 정렬, 대소문자 구분 X
        //HEAD가 같으면 NUMBER를 기준으로 정렬
        //012,12는 같은값임 -> 숫자는 int취급
        //HEAD, NUMBER가 같으면 그냥 입력순서대로 -> 자바 정렬이니까 무시 
        ArrayList<String> headList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();
        
        for(int i=0; i<files.length; i++){
            String HEAD = "";
            String NUMBER = "";
            //문자순 그대로 먼저 정렬하고, 같은 경우에만 숫자로 변환해서 정렬 ?
            //숫자로 변환할라면 charAt을 써서 isDigit이면 그 애들만 따로 모으기
            String number = "";
            boolean isNum = false;
            String str = files[i];
            String str2 = "";
            //처음 숫자가 나오는 곳 까지가 ,,,, head
            for(int j=0; j<str.length(); j++){
                if(Character.isDigit(str.charAt(j))){
                    isNum = true;
                    str2 = str.substring(j, str.length());
                    headList.add(HEAD.toLowerCase());
                    break;
                }
                if(isNum == false){
                    HEAD = str.substring(0,j+1);
                }
            }
            
            boolean isNum2 = true;
            for(int j=0; j<str2.length(); j++){
                if(!Character.isDigit(str2.charAt(j))){
                    isNum2 = false;
                    break;
                }
                if(isNum2 == true && NUMBER.length() < 5){
                    NUMBER = str2.substring(0, j+1);
                }
            }
            numList.add(Integer.parseInt(NUMBER + ""));
        }
    
        //HEAD를 비교해서 다르면 NUMBER를 기준으로 정렬
        //index는 전부 같음(files, headList, numList);
        Integer[] index = new Integer[files.length];
        for(int i=0; i<files.length; i++){
            index[i] = i;
        }
        ArrayList<String> answer = new ArrayList<>();
        Arrays.sort(index, (a,b) -> {
            if(headList.get(a).equals(headList.get(b))){
                return numList.get(a)-numList.get(b);
            }
            return headList.get(a).compareTo(headList.get(b));
        });
        for(int i=0; i<index.length; i++){
            answer.add(files[index[i]]);
        }
        return answer;
    }
}