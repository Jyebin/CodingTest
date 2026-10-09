class Solution {
    public int solution(String s) {
        //문자열 절반 길이만큼의 단위까지 자르기
        int answer = s.length();
        //반복되는 횟수 + 문자
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            String now = s.substring(0,i);
            int num = 1; //반복되는 횟수
            //now가 전체 길이 문자에서 몇 번 반복되는지 보기
            for(int j=i;j<s.length(); j+=i){
                if(now.equals(s.substring(j, Math.min(j+i, s.length())))){
                    num ++; //숫자만 세기 때문에 마지막꺼는 기록이 안됨
                }else{
                    if(num == 1){
                        sb.append(now);
                    }else{
                        sb.append(num + now);
                    }
                    num = 1;
                    now = s.substring(j, Math.min(j+i, s.length()));
                }
            }
            if(num == 1){
                sb.append(now);
            }else{
                sb.append(num + now);
            }
            answer = Math.min(answer, sb.toString().length());
        }
        return answer;
    }
}