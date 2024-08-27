class Solution {
    public int solution(String s) {
        //s : 숫자와 z가 공백으로 구분
        //만약 z가 나오면 직전 수를 빼는 것
        String[] str = s.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i=1; i<str.length; i++){
            if(str[i].equals("Z")){
                answer = answer - Integer.parseInt(str[i-1]);
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}