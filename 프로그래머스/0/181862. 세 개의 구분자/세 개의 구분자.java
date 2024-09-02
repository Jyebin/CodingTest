import java.util.*;

class Solution {
    public ArrayList solution(String myStr) {
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        String[] arr = myStr.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            list.add("EMPTY");
        }
        return list;
    }
}