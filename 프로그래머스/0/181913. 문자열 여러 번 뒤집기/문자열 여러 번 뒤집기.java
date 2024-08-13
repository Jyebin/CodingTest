class Solution {
    public String solution(String my_string, int[][] queries) {        
        //substring으로 범위 나누기
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            String frontStr = my_string.substring(0, start); //처음부터 start까지
            String midStr = "";
            String endStr = my_string.substring(end+1, my_string.length()); //end부터 끝까지
                        
            for(int j=end; j>=start; j--){
                midStr = midStr + my_string.charAt(j);
            }
            my_string = frontStr + midStr + endStr;
        }
        return my_string;
    }
}