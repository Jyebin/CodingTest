class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i=0; i<dic.length; i++){
            boolean isIn = true; //존재한다고 가정
            for(int j=0; j<spell.length; j++){ //spell을 한 글자씩 비교
                if(!dic[i].contains(spell[j])){ //현재 문자에 spell이 있지 않으면
                    isIn = false;
                    break;
                }
            }
            if(isIn == true){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}