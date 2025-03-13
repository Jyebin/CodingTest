import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        //score[][0] : 영어 점수
        //score[][1]: 수학 점수
        //1. 각각의 배열에 담긴 평균을 구하기
        //2. 등수를 매기기
        int length = score.length;
        //int[][] avgList = new int[length][2]; //첫 번째 방에 순서를, 두 번째 방에 평균 점수를 저장
        ArrayList<double[]> avgList = new ArrayList<>();
        for(int i=0; i<length; i++){
            int Eng = score[i][0];
            int Math = score[i][1];
            double avg = (double)(Eng + Math) / 2.0;
            avgList.add(new double[]{i, avg});
            // avgList[i][0] = i;
            // avgList[i][1] = avg;
        }
        //avgList 배열의 index를 return하면 되고, avg값을 기준으로 정렬하면 됨
        //index와 내용물을 가진 배열을 생성해 그 값을 정렬
        Collections.sort(avgList, (a,b) -> Double.compare(b[1], a[1])); //평균 점수를 기준으로 내림차순 정렬
        
        int[] answer = new int[length];
        int rank = 1;
        
        answer[(int)avgList.get(0)[0]] = rank; //첫 번째 학생의 등수
        
        for(int i=1; i<length; i++){
            if(avgList.get(i)[1] == avgList.get(i-1)[1]){
                answer[(int)avgList.get(i)[0]] = rank;
            } else {
                rank = i + 1;
                answer[(int)avgList.get(i)[0]] = rank;
            }
        }
        
        return answer;
    }
}