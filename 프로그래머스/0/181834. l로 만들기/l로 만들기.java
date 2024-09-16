class Solution {
    public String solution(String myString) {
        //l보다 앞선 문자를 l로 만들기
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)<'l'){
                myString = myString.replace(Character.toString(myString.charAt(i)), "l");
            }
        }
        
        return myString;
    }
}