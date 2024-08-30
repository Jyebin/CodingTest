class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        //둘 다 소문자로 변경 한 후 비교
        int answer = 0;
        if(myString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}