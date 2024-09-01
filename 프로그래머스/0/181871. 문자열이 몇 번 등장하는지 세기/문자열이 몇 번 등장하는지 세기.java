class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        //pat이 등장하는 횟수 return
        for(int i=0; i<=myString.length()-pat.length(); i++){
            if(myString.substring(i,i+pat.length()).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}