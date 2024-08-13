class Solution {
    public String solution(String my_string, int[] index_list) {
        
        int idxLen = index_list.length;
        String answer = "";
        
        for(int i=0; i<idxLen; i++){
            answer = answer + my_string.charAt(index_list[i]);
        }
        return answer;
    }
}