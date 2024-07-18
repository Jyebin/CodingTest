import java.util.*;

class Solution {
    public int solution(String dirs) {
        //U : x그대로, y+1
        //D : x그대로, y-1
        //R : x+1, y그대로
        //L : x-1, y그대로
        //범위에서 벗어나면 그 명령어 무시
        //그 좌표에 저장할 때 어느 방향에서 왔는지도 같이 저장
        HashSet<String>[][] coor = new HashSet[11][11]; //좌표의 방향 저장할 hashset 타입 이중배열
        //coor[0][0]에는 0,0을 방문한 hashset이 들어가 있는 것
        //hashset안에 있으면 무시하고, 없으면 cnt 값 증가
        //반대방향도 고려해야됨
         for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                coor[i][j] = new HashSet<>();
            }
        }

        int cnt = 0;
        //5,5가 원점
        int x = 5;
        int y = 5;
        
        for(int i=0;i<dirs.length();i++){
            char dir = dirs.charAt(i);
            if(dir == 'U'){
                if(y>=0 && y<=10){
                    y = y + 1;
                      if(y>=0 && y<=10){
                          if(!coor[x][y].contains("U") && !coor[x][y-1].contains("D")){
                              coor[x][y].add("U");
                              coor[x][y-1].add("D");
                              cnt++;
                          }
                      }else{
                          y = y - 1; //조건에 맞지 않으면 더해준 것을 다시 빼 주어야 함
                      }
                }
            }else if(dir == 'D'){
                if(y>=0 && y<=10){
                    y = y - 1;
                    if(y>=0 && y<=10){
                        if(!coor[x][y+1].contains("U") && !coor[x][y].contains("D")){
                            coor[x][y+1].add("U");
                            coor[x][y].add("D");
                            cnt++;
                        }
                    }else{
                        y = y + 1;
                    }
                }
            }else if(dir == 'R'){
                if(x>=0 && x<=10){
                    x = x + 1;
                    if(x>=0 && x<=10){
                        if(!coor[x][y].contains("R") && !coor[x-1][y].contains("L")){
                            coor[x][y].add("R");
                            coor[x-1][y].add("L");
                            cnt++;
                        }
                    }else{
                        x = x - 1;
                    }
                }
            }else if(dir == 'L'){
                if(x>=0 && x<=10){
                    x = x - 1;
                      if(x>=0 && x<=10){
                          if(!coor[x+1][y].contains("R") && !coor[x][y].contains("L")){
                              coor[x+1][y].add("R");
                              coor[x][y].add("L");
                              cnt++;
                          }
                      }else{
                          x = x + 1;
                      }
                }
            }
        }
        return cnt;
    }
}