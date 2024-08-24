class Solution {
    public int solution(int[] arr, int idx) {
        //arr의 원소는 1 또는 0
        //idx보다 크면서 배열의 값이 1인 가장 작은 idx
        int answer = -1;
        int len = arr.length;

        for(int i=0; i<len; i++){ //arr의 index값
            if(i >= idx && arr[i] == 1){ //index보다 크면서 배열의 값이 1
                answer = i; //index를 return
                break;
            }
        }
        
        return answer;
    }
}