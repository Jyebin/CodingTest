import java.util.*;

class Solution {
    public ArrayList solution(String[] str_list) {
        int leftIdx = -1;
        int rightIdx = -1;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                leftIdx = i;
                break;
            }else if(str_list[i].equals("r")){
                rightIdx = i;
                break;
            }
        }
        
        if(leftIdx < rightIdx){
            for(int i=rightIdx + 1; i<str_list.length; i++){
                list.add(str_list[i]);   
            }
        }else if(leftIdx > rightIdx){
            for(int i=0; i<leftIdx; i++){
                list.add(str_list[i]);
            }
        }
     
        return list;
    }
}