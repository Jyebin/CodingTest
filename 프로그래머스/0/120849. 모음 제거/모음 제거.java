class Solution {
    public String solution(String my_string) {
        String answer = "";
        //모음 : a,e,i,o,u
        for(int i=0; i<my_string.length(); i++){
            my_string = my_string.replace("a","");
            my_string = my_string.replace("e","");
            my_string = my_string.replace("i","");
            my_string = my_string.replace("o","");
            my_string = my_string.replace("u","");
        }
        return my_string;
    }
}