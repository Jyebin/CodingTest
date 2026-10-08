class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        String answer = "";
        for(char c : s.toCharArray()){ //한글자씩 탐색
            if(c == ' '){
                sb.append(" ");
                continue;
            }
            if(!Character.isUpperCase(c)){
                sb.append((char)((n + (c - 'a')) % 26 + 'a'));
            }else{
                sb.append((char)((n + (c - 'A')) % 26 + 'A'));
            }
        }
        answer = sb.toString();
        return answer; 
    }
    
}