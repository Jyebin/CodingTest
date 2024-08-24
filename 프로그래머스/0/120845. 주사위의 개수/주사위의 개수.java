import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        //가로 : box[0]
        //세로 : box[1]
        //높이 : box[2]
        //주사위 : n
        int width = (int)Math.ceil(box[0]/n);
        int depth = (int)Math.ceil(box[1]/n);
        int height = (int)Math.ceil(box[2]/n);

        int answer = width * depth * height;
        return answer;
    }
}