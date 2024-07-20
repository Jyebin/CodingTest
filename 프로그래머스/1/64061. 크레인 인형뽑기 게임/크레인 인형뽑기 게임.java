import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        //각 열의 값들을 스택에 저장해야 함
        //스택을 저장할 배열 선언
        Stack<Integer>[] stackArr = new Stack[board[0].length];
        Stack<Integer> stack = new Stack<>(); //바구니
        int answer = 0;
        
        for(int i=0; i<stackArr.length; i++){
            stackArr[i] = new Stack<>(); //각 방마다 스택 생성
        }
        
        for(int i=board.length-1; i>=0; i--){ //역순으로(아래에서부터 위로) 스택에 저장해야 함
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != 0){ //0이 아니면 스택에 추가
                    stackArr[j].push(board[i][j]);
                }
            }
        }
        
        for(int i=0;i<moves.length;i++){
            int stackArrNum = moves[i] -1; //어느 열인지
            if(!stack.isEmpty() && !stackArr[stackArrNum].isEmpty()){ //바구니와 각 열의 스택이 비어 있지 않으면
                int rowTop = stackArr[stackArrNum].peek(); //각 열의 스택의 최상단 요소
                int basketTop = stack.peek(); //바구니의 최상단 요소
                if(rowTop == basketTop){ //각 열의 스택의 최상단 요소와 바구니의 최상단 요소가 같으면
                    stackArr[stackArrNum].pop(); //각 열 스택에서 꺼냄
                    stack.pop(); //바구니에서 꺼냄
                    answer = answer + 2; //cnt 값 2 증가
                }else{ //같지 않으면 각 열 스택에서 꺼내고 그냥 바구니에 추가
                    stack.push(stackArr[stackArrNum].pop());
                }
            }else if(!stackArr[stackArrNum].isEmpty()){ //바구니가 비어 있으면
                stack.push(stackArr[stackArrNum].pop());
            }
        }
        return answer;
    }
}