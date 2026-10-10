class Solution {
    public int[] solution(String s) {
    
        //자신보다 앞에 나왔으면서 자신과 가장 가까운 곳에 있는 글자
        int[] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = -1;
        }
        
        for(int i=0; i<s.length(); i++){
            String now = s.charAt(i) + ""; //지금꺼랑 그 앞에꺼랑 비교
            for(int j=i-1; j>=0; j--){
                String str = s.charAt(j) + ""; //지금꺼부터 이전꺼까지
                if(now.equals(str) && arr[i] == -1){
                    arr[i] = i - j;
                }else if(now.equals(str)){
                    arr[i] = Math.min(arr[i], i-j);
                }
            }
        }
        return arr;
    }
}