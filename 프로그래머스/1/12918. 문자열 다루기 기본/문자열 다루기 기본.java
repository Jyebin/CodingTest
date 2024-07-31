class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6){ //길이가 4이거나 6이면
            return false;
        }
        
        for(int i=0; i<s.length(); i++){ //범위에 맞으면
            if('0' > s.charAt(i) || s.charAt(i) > '9'){
                return false;
            }
        }
    
        return answer;
    }
}