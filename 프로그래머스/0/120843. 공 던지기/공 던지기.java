class Solution {
    public int solution(int[] numbers, int k) {
        //1번부터 공 던짐
        //오른쪽으로 1명 건너뛰고 다음사람에게 던짐
        //공을 던질 수 있는 사람(i가 i+2번째 사람
        int len = numbers.length;
        int idx = 0;
        
        
        for(int i=1; i<k; i++){ //k번 공을 던짐
            idx = (idx + 2) % len;
        }

        return numbers[idx];
    }
}