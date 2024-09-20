class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int halfX = board[0]/2;
        int halfY = board[1]/2;
  
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                x--;
                if(x < (0-halfX)){
                    x = 0-halfX;
                }
            }else if(keyinput[i].equals("right")){
                x++;
                if(x > halfX){
                    x = halfX;
                }
            }else if(keyinput[i].equals("up")){
                y++;
                if(y > halfY){
                    y = halfY;
                }
            }else if(keyinput[i].equals("down")){
                y--;
                if(y < (0-halfY)){
                    y = 0-halfY;
                }
            }
        }
        int[] answer = {x,y};
        return answer;
    }
}