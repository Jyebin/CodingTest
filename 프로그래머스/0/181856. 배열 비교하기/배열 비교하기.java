class Solution {
    public int solution(int[] arr1, int[] arr2) {
        //배열의 길이가 긴 쪽이 더 큰 것
        //배열의 길이가 같으면 합을 비교
        int answer = 0;
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int arr1Sum = 0;
        int arr2Sum = 0;
        for(int i=0; i<arr1Len; i++){
            arr1Sum += arr1[i];
        }
        for(int i=0; i<arr2Len; i++){
            arr2Sum += arr2[i];
        }
        if(arr1Len < arr2Len){
            answer = -1;
        }else if(arr1Len > arr2Len){
            answer = 1;    
        }else{
            //같으면
            if(arr1Sum < arr2Sum){
                answer = -1;
            }else if(arr1Sum > arr2Sum){
                answer = 1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}