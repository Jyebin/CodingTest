class Solution {
    String[] dict = {"A", "E", "I", "O", "U"};
    int answer;
    int cnt;
    
    public int solution(String word) {
        dfs(word, ""); //횟수, 정답 문자, 현재 문자
        return answer;
    }
    void dfs(String word, String now){
        if(word.equals(now)){
            answer = cnt;
            return;
        }
        if(now.length() == 5){
            return;
        }
        for(int i=0; i<5; i++){
            cnt++;
            dfs(word, now + dict[i]);
        }
    }
}