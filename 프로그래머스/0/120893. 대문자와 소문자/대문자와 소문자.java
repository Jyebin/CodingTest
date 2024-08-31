import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){ //대문자면
                sb.append(Character.toString(my_string.charAt(i)).toLowerCase());
            }else{
                sb.append(Character.toString(my_string.charAt(i)).toUpperCase());
            }
        }
        return sb.toString();
    }
}