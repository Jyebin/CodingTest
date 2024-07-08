import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int N = nums.length;
        for(int i=0;i<N;i++){
            set.add(nums[i]);
        }
        int max = N / 2;
        if(set.size() > max){
            answer = max;
        }else{
            answer = set.size();
        }
        
        return answer;
    }
}