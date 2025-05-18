import java.util.ArrayList;

class Solution {
    // 가장 많이 맞춘 사람 -> dfs
    public ArrayList solution(int[] answers) {
        //1번 : 1~5 반복
        //2번 : 2,1,2,3,2,4,2,5 반복
        //3번 : 3,3,1,1,2,2,4,4,5,5 반복
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            list1.add(first[i%5]);
            list2.add(second[i%8]);
            list3.add(third[i%10]);
        }
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == list1.get(i)){
                cnt1++;
            }
            if(answers[i] == list2.get(i)){
                cnt2++;
            }
            if(answers[i] == list3.get(i)){
                cnt3++;
            }
        }
        if(cnt1 == cnt2 && cnt2 == cnt3){
            answer.add(1);
            answer.add(2);
            answer.add(3);
        }else if(cnt1 == cnt2 && cnt1 > cnt3){
            answer.add(1);
            answer.add(2);
        }else if(cnt1 == cnt3 && cnt1 > cnt2){
            answer.add(1);
            answer.add(3);
        }else if(cnt2 == cnt3 && cnt2 > cnt1){
            answer.add(2);
            answer.add(3);
        }else if(Math.max(Math.max(cnt1, cnt2), cnt3) == cnt1){
            answer.add(1);
        }else if(Math.max(Math.max(cnt1, cnt2), cnt3) == cnt2){
            answer.add(2);
        }else if(Math.max(Math.max(cnt1, cnt2), cnt3) == cnt3){
            answer.add(3);
        }
        return answer;
    }
}