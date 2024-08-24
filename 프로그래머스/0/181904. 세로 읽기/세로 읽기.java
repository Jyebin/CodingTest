class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        //한 줄에 m글자씩 가로로 적음
        //왼쪽부터 세로로 c열에 적힌 글자 return
        Character[][] arr = new Character[my_string.length()/m][m];
        int k = 0;
        
        for(int i=0; i<my_string.length()/m; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = my_string.charAt(k);
                k++;
            }
        }
        
         for(int i=0; i<my_string.length()/m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]);
            }
             System.out.println();
        }
        
        for(int i=0; i<my_string.length()/m; i++){
            answer = answer + arr[i][c-1];
        }
        
        return answer;
    }
}