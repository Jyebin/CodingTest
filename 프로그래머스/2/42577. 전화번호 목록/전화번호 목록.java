import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //오름차순 정렬
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length - 1; i++){
            String front = phone_book[i];
            String back = phone_book[i+1];
            if(back.startsWith(front)){
                answer = false;
            }
        }
        return answer;
    }
}