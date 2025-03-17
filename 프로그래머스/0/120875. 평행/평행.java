class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        //두 직선이 평행이 되는 경우
        //x가 같고 y가 다른 경우
        //y가 같고 x가 다른 경우
        //dots[0] : x좌표
        //dots[1] : y좌표
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];
        
        //기울기(y좌표 차 / x좌표 차)가 같으면 평행
        //모든 점에 대한 기울기 구하기 -> 우선 큰 순서대로 정렬
        double a1 = (double)(y1-y2) / (x1-x2);
        double a2 = (double)(y3-y4) / (x3-x4);
        
        double b1 = (double)(y1-y3) / (x1-x3);
        double b2 = (double)(y2-y4) / (x2-x4);
        
        double c1 = (double)(y1-y4) / (x1-x4);
        double c2 = (double)(y2-y3) / (x2-x3);
        
        if(a1 == a2 || b1 == b2 || c1 == c2){
            answer = 1;
        }
        
        return answer;
    }
}