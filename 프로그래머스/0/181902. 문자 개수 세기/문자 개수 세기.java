class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; //index가 0인게 A(065)
        //A : 065, a : 097
        //7개차이
        //Z : 090, z : 122
        
        for(int i=0; i<my_string.length(); i++){
            char now = my_string.charAt(i);
            //대문자이면
            if(now >= 'A' && now <= 'Z'){ //A가 0
                answer[now - 65]++;
            }else if(now >= 'a' && now<= 'z'){ //a가 26이어야함
                answer[now - 71] ++;
            }
        }
        return answer;
    }
}