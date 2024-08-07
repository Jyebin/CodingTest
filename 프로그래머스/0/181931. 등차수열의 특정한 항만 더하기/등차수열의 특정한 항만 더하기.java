class Solution {
    public int solution(int a, int d, boolean[] included) {
        int n = included.length;
        int answer = 0;
        //첫째항 : a, 공차 : d
        //included[i] : i+1번째 항
        int num = 0;
        int idx = a;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = idx;
            if(included[i] == true){
                answer = answer + arr[i];
            }
            idx = idx + d;
        }
        return answer;
    }
}