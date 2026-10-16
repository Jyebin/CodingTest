import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(String today, String[] terms, String[] privacies) {
        //오늘 날짜로 파기해야 할 개인정보 번호 구하기
        //today: 오늘 날짜
        //terms: 약관의 유효기간
        //privacies: 수집된 개인정보 정보
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>(); //약관종류, 유효기간
        
        for(String st : terms){
            String[] arr = st.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }
        String[][] strArr = new String[privacies.length][3];
        int i=0;
        for(String st : privacies){
            String[] arr = st.split(" ");
            String day = arr[0];
            String type = arr[1];
            strArr[i][0] = i+1+""; //번호
            strArr[i][1] = day; //수집일자
            strArr[i][2] = type; //약관 종류
            i++;
        }
        String[] todaySt = today.split("\\.");
        int todayInt = Integer.parseInt(todaySt[0]) * 28 * 12
            + Integer.parseInt(todaySt[1]) * 28
            + Integer.parseInt(todaySt[2]);
        
        
        for(int j=0; j<strArr.length; j++){
            String num = strArr[j][0];
            String date = strArr[j][1];
            String type = strArr[j][2];
            
            if(map.containsKey(type)){
                int deadLine = map.get(type) * 28;
                //수집일자 + deadLine이랑 오늘날짜 비교하기
                String[] dates = date.split("\\.");
                int date2 = (Integer.parseInt(dates[0]) * 12 * 28)
                    + (Integer.parseInt(dates[1]) * 28)
                    + Integer.parseInt(dates[2]);
                
                int totalDate = date2 + deadLine;
                
                if(totalDate <= todayInt){
                    answer.add(Integer.parseInt(num));
                }
            }
        }
        return answer;
    }
}