class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[202]; //배열을 만들어 두고 그 점이 등장하면 방을 1 증가
        
        for(int i=0; i<lines.length; i++){
            int start = lines[i][0];
            int end = lines[i][1];
            
            for(int j = start; j < end; j++){ //범위 안의 방 배열 1 증가
                arr[j + 100] ++;
            }
        }
        
        for(int i=0; i<arr.length-1; i++){ //연속해서 나오는 값이 2 이상일 경우에만
            if(arr[i] > 1){
                answer++;
            }
        }
        return answer;
    }
}