class Solution {
    public int solution(int price) {
        //10만원 이상 -> 5퍼
        //30만원 이상 -> 10퍼
        //50만원 이상 -> 20퍼
        double answer = 0;
        
        if(price >= 500000){
            answer = price * 0.8;
        }else if(price >= 300000){
            answer = price * 0.9;
        }else if(price >= 100000){
            answer = price * 0.95;
        }else{
            answer = price;
        }
        return (int) answer;
    }
}