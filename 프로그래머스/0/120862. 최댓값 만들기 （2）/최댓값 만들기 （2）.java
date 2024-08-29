import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        //음수 두 개, 양수 두 개 곱한게 최대
        ArrayList<Integer> negative = new ArrayList<>(); //음수
        ArrayList<Integer> positive = new ArrayList<>(); //양수
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < 0){
                negative.add(numbers[i]);
            }else if(numbers[i] > 0){
                positive.add(numbers[i]);
            }
        }
        
        int biggestNegative = 0;
        int biggestPositive = 0;
        
        if(numbers.length == 2){
            return numbers[0] * numbers[1];
        }
        if(negative.size() >= 2){
            Collections.sort(negative, Collections.reverseOrder());
            biggestNegative = negative.get(0) * negative.get(1);
        }
        if(positive.size() >= 2){
            Collections.sort(positive, Collections.reverseOrder());
            biggestPositive = positive.get(0) * positive.get(1);
        }
        if(biggestNegative < biggestPositive){
            return biggestPositive;
        }else{
            return biggestNegative;
        }
    }
}