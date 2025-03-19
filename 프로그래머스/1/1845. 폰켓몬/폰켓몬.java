import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        //중복되면 안되므로 HashSet 사용
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int num = nums.length / 2;
        answer = Math.min(num, set.size());
        
        return answer;
    }
}