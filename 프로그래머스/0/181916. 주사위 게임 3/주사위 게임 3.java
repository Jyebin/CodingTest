import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 네 개 전부 같으면 1111*p
        // 세개만 같으면 (10 * p + q) ^ 2
        // 두개씩 같으면 (p+q) * |p-q|
        // 두개는 같고 나머지는 다르면
        // 모두 다르면 가장 작은 숫자만큼
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<Key, Value> = <주사위 수, 개수>
        int[] dice = {a, b, c, d};
        for(int i=0; i<4; i++){
            if(!map.containsKey(dice[i])){
                map.put(dice[i], 1);
            }else{
                map.put(dice[i], map.get(dice[i])+1);
            }
        }
        if(map.size() == 1){
            answer = 1111 * a;
        }else if(map.size() == 2){
            List<Integer> list = new LinkedList<>(map.keySet()); //모든 키를 가져옴
            
            if(map.get(list.get(0)) == 3){
                int p = list.get(0);
                int q = list.get(1);
                answer = (10 * p + q) * (10 * p + q);
            }else if(map.get(list.get(1)) == 3){
                int p = list.get(1);
                int q = list.get(0);
                answer = (10 * p + q) * (10 * p + q);
            }
            if(map.get(list.get(0)) == 2 && map.get(list.get(1)) == 2){
                int p = list.get(0);
                int q = list.get(1);
                if(p > q){
                    answer = (p + q) * (p - q);
                }else{
                    answer = (p + q) * (q - p);
                }
            }
        }else if(map.size() == 3){
            List<Integer> list = new LinkedList<>(map.keySet());
            if(map.get(list.get(0)) == 2){
                int p = list.get(0);
                answer = list.get(1) * list.get(2);
            }else if(map.get(list.get(1)) == 2){
                int p = list.get(1);
                answer = list.get(0) * list.get(2);
            }else if(map.get(list.get(2)) == 2){
                int p = list.get(2);
                answer = list.get(1) * list.get(0);
            }
        }else if(map.size() == 4){
            List<Integer> list = new LinkedList<>(map.keySet());
            Collections.sort(list); //오름차순 정렬
            answer = list.get(0);
        }
        return answer;
    }
}