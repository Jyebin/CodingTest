class Solution {
    public int solution(String s) {
        int answer = s.length(); //최소 길이, s.length인 이유는 압축이 하나도 안된 경우도 있기 때문
        //1. 일단 비교할 문자를 찾음
        int num = 1;
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            String now = s.substring(0,i);
            for(int j=i; j<=s.length(); j+=i){
                String str2 = s.substring(j, Math.min(s.length(), i+j));
                if(now.equals(str2)){ //같으면
                    num ++;
                } else { //다르면 문자열 합치기
                    if(num != 1){
                        sb.append(num);
                        sb.append(now);
                    }else{
                        sb.append(now);
                    }
                    num = 1; //초기화
                }
                now = str2;
            }
            if(num != 1){
                sb.append(num);
                sb.append(now);
            } else {
                sb.append(now);
            }
            answer = Math.min(answer, sb.length());   
        }

        return answer;
    }
}