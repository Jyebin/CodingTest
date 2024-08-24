class Solution {
    public int[] solution(int[] numbers, String direction) {
        //numbers의 원소를 direction방향으로 한 칸씩 회전
        //direction == right : index + 1
        //direction == left : index -1
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0; i<numbers.length; i++){
                answer[(i+1) % numbers.length] = numbers[i];
            }
        }else{
            for(int i=0; i<numbers.length; i++){
                answer[(i+numbers.length-1) % numbers.length] = numbers[i];
            }
            
        }
        
        return answer;
    }
}