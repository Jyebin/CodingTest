import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        int answer = 0;
        //종이조각으로 만들 수 있는 소수
        //소수 : 2부터 자기 자신의 루트까지 나누어지는 숫자가 없는 수
        ArrayList<Character> list = new ArrayList<>();
       
        for(int i=0; i<numbers.length(); i++){
            list.add(numbers.charAt(i));
        }
        
        visited = new boolean[numbers.length()];
        
        for(int i=0; i<numbers.length(); i++){
            visited = new boolean[numbers.length()];
            dfs("", numbers);
        }
        
        for(int i : set){
            boolean isSoSu = true;
            if(i <= 1){ //1은 소수가 아님
                continue;
            }
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){ //나누어 떨어지면 소수가 아님
                    isSoSu = false;
                }
            }
            if(isSoSu){
                answer ++;
            }
        }
        
        return answer;
    }
    
    void dfs(String current, String numbers){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(current+numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }
}