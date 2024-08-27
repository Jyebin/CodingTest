class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        int len = str.length;
        for(int i=0; i<len; i++){
            String now = str[i];
            for(int j=i+1; j<len; j++){
                if(now.equals(str[j])){
                    str[j] = "";
                }
            }
        }
        for(int i=0; i<len; i++){
            if(!str[i].equals("")){
                answer = answer + str[i];
            }
        }
        return answer;
    }
}