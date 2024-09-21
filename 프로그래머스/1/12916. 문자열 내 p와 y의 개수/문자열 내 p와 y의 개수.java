class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            if(Character.toString(s.charAt(i)).equals("P")){
                pCnt ++;
            }else if(Character.toString(s.charAt(i)).equals("Y")){
                yCnt ++;
            }
        }
        if(pCnt != yCnt){
            answer = false;
        }
        return answer;
    }
}