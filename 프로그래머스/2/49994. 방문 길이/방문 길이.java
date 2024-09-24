import java.util.*;

class Solution {
    public int solution(String dirs) {
        HashSet<String> set = new HashSet<>(); // x,y,방향을 string으로 합쳐서 넣기
        int x = 0;
        int y = 0;

        for (int i = 0; i < dirs.length(); i++) {
            if (dirs.charAt(i) == 'R') {
                if (x < 5) {
                    set.add(x + "" + y + "R");
                    x++;
                    set.add(x + "" + y + "L");
                }
            }
            if (dirs.charAt(i) == 'L') {
                if (x > -5) {
                    set.add(x + "" + y + "L");
                    x--;
                    set.add(x + "" + y + "R");
                }
            }
            if (dirs.charAt(i) == 'U') {
                if (y < 5) {
                    set.add(x + "" + y + "U");
                    y++;
                    set.add(x + "" + y + "D");
                }
            }
            if (dirs.charAt(i) == 'D') {
                if (y > -5) {
                    set.add(x + "" + y + "D");
                    y--;
                    set.add(x + "" + y + "U");
                }
            }
        }

        return set.size()/2;
    }
}
