class Solution {
    public int solution(String[] babbling) {
        //aya
        //ye
        //woo
        //ma
        //한 번씩 조합해 이어 붙인 발음
        //발음할 수 있는 최대 개수 구하기
        int answer = 0;
        String nowStr = "";
        for(int i=0; i<babbling.length; i++){
            nowStr = babbling[i];
            for(int j=0; j<nowStr.length(); j++){
                if(nowStr.contains("aya")){
                    nowStr = nowStr.replace("aya"," ");
                }
                if(nowStr.contains("ye")){
                    nowStr = nowStr.replace("ye"," ");
                }
                if(nowStr.contains("woo")){
                    nowStr = nowStr.replace("woo"," ");
                }
                if(nowStr.contains("ma")){
                    nowStr = nowStr.replace("ma"," ");
                }
            }  
            for(int j=0; j<nowStr.length(); j++){
                nowStr = nowStr.replace(" ", "");
                    if(nowStr.equals("")){
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}