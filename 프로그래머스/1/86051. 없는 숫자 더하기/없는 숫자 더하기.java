class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] nums = new int[10];
        for(int i=0; i<10; i++){
            answer += i;
        }
        System.out.println(answer);
        for(int i=0; i<numbers.length; i++){
            boolean isIn = false;
            int now = numbers[i];
            for(int j=0; j<10; j++){
                if(now == nums[j]){
                    isIn = true;
                    break;
                }
            }
            if(!isIn){
                answer = answer - now;
            }
        }
        return answer;
    }
}