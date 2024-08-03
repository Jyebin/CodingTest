import java.util.*;

class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> big = new HashMap<>();
        HashMap<Integer, Integer> little = new HashMap<>();
        int answer = 0;
        int length = topping.length;
        
        for (int i = 0; i < length; i++) {
            if (little.containsKey(topping[i])) {
                little.put(topping[i], little.get(topping[i]) + 1);
            } else {
                little.put(topping[i], 1);
            }
        }

        for (int j = 0; j < length - 1; j++) {
            int current = topping[j];
            
            if (big.containsKey(current)) {
                big.put(current, big.get(current) + 1);
            } else {
                big.put(current, 1);
            }
            
            if (little.containsKey(current)) {
                int count = little.get(current);
                if (count == 1) {
                    little.remove(current);
                } else {
                    little.put(current, count - 1);
                }
            }

            if (little.size() == big.size()) {
                answer++;
            }
        }

        return answer;
    }
}
