import java.util.*;

class Solution {
    public ArrayList solution(String[] quiz){
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<quiz.length; i++){
            int result = 0;
            String now = quiz[i];
            String[] input = now.split(" ");
            switch(input[1]){
                case "+" : result = Integer.parseInt(input[0]) + Integer.parseInt(input[2]);
                    break;
                case "-" : result = Integer.parseInt(input[0]) - Integer.parseInt(input[2]);
                    break;
            }
            if((result+"").equals(input[4])){
                list.add("O");
            }else{
                list.add("X");
            }
        }
        return list;
    }
}