import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //배열을 큐에 넣고, goal에서의 단어와 비교하면 됨
        Queue<String> cardsQueue1 = new LinkedList<>();
        Queue<String> cardsQueue2 = new LinkedList<>();
        String answer = "Yes";
        for(int i=0;i<cards1.length;i++){
            cardsQueue1.add(cards1[i]);
        }
        for(int i=0;i<cards2.length;i++){
            cardsQueue2.add(cards2[i]);
        }
        for(int i=0;i<goal.length;i++){
            String c1 = cardsQueue1.peek();
            String c2 = cardsQueue2.peek();
            if(!cardsQueue1.isEmpty() && c1.equals(goal[i])){
                cardsQueue1.poll();
            }else if(!cardsQueue2.isEmpty() && c2.equals(goal[i])){
                cardsQueue2.poll();
            }else{
                answer = "No";
            }
        }
        return answer;
    }
}