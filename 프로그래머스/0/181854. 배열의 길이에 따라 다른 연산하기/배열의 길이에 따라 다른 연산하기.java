class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        if(len % 2 == 1){ //홀수라면
            //짝수 인덱스 위치 + n
            for(int i=0; i<len; i+=2){
                arr[i] += n;
            }
        }else{
            //홀수 인덱스 위치 _+ n 
            for(int i=1; i<len; i+=2){
                arr[i] += n;
            }
        }
        return arr;
    }
}