class Solution {
    public int solution(int chicken) {
        int coupon = 0;

        while(chicken >= 10){
            int leftChicken = chicken % 10; //남은 치킨
            coupon += chicken / 10;
            chicken = chicken / 10 + leftChicken;
        }
        return coupon;
    }
}