import java.util.*;

class Solution {
    public ArrayList solution(String[] picture, int k) {
        int len = picture.length;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            String newStr = "";
            String[] str = picture[i].split("");
            for(int j=0; j<str.length; j++){
                for(int a=0; a<k; a++){
                    newStr += str[j];
                }
            }
            for(int j=0; j<k; j++){
                list.add(newStr);
            }
        }
        return list;
    }
}