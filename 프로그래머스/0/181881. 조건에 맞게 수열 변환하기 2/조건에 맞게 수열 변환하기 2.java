class Solution {
    public int solution(int[] arr) {
        //x번 반복한 이후로 배열이 변하는지 안변하는지를 판단하는 것
        //현재값을 기준으로 이전 배열과 비교해야 됨(원래 배열과 비교하는 것 X)
        int len = arr.length;
        int answer = 0;
        boolean isChanged = true;
        while(isChanged){
            isChanged = false;
            for(int i=0; i<len; i++){
                int before = arr[i]; //변경되기 전 배열
                if(arr[i] >= 50 && arr[i]%2 == 0){
                    arr[i] = arr[i]/2;
                }else if(arr[i] < 50 && arr[i]%2 == 1){
                    arr[i] = arr[i]*2+1;
                }
                if(before != arr[i]){ //변경된 후의 배열과 같다면
                    isChanged = true;
                }
            }
            if(isChanged){
                answer++;
            }
        }
        return answer;
    }
}