class Solution {
    public String solution(String code) {
        //문자가 1이면 mode 변경(0,1)
        String ret = "";
        String answer = "";
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            if(mode == 0){
                if(i%2 == 0 && code.charAt(i) != '1'){ //1이면 mode 변경
                    ret = ret + code.charAt(i);
                }
                if(code.charAt(i) == '1'){
                    mode = 1;
                }
            }else if(mode == 1){
                if(i%2 != 0 && code.charAt(i) != '1'){
                    ret = ret + code.charAt(i);
                }
                if(code.charAt(i) == '1'){
                    mode = 0;
                }
            }
        }
        answer = ret;
        if(ret == "" || ret == null){
            answer = "EMPTY";
        }
        return answer;
    }
}