import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] arrive = new int[N+1]; //i : 각 단계, arrive[i] : 도달한 사람 수
        int peoples = stages.length; //도전자수
        for(int i=0; i<peoples; i++){
            if(stages[i] <= N){
                arrive[stages[i]-1]++;
            }
        }
        //실패율 = 도달했으나 클리어하지 못한 사람 수 / 도달한 사람 수
        double[] failRate = new double[N+1]; //각 단계 별 실패율
        //i가 스테이지 넘버, failRate[i]가 실패율
        //실패율기준 내림차순 정렬. 같으면 작은 번호가 먼저오게
        ArrayList<double[]> list = new ArrayList<>();
        
        for(int i=0; i<N+1; i++){
            if(arrive[i] == 0){
                failRate[i] = 0;
            }else{
                failRate[i] = (double) arrive[i] / (double) peoples;
                peoples = peoples - arrive[i]; //도달한 사람 수 제외
            }
            double[] forSort = new double[2]; //[0]에는 단계, [1]에는 실패율 저장
            forSort[0] = (double)i;
            forSort[1] = failRate[i];
            list.add(forSort);
        }
        
        Collections.sort(list, new Comparator<double[]>(){
           @Override
            public int compare(double[] o1, double[] o2){
                //실패율이 같으면 스테이지 번호 오름차순
                if(o1[1] == o2[1]){
                    return Double.compare(o1[0], o2[0]);
                }
                //실패율 내림차순
                return Double.compare(o2[1], o1[1]);
            }
        });
        
        int[] answer = new int[N];
        for(int i=0; i<N; i++){
            answer[i] = (int)list.get(i)[0]+1; //i번째의 0번째(스테이지 번호)를 가져오기
        }
        return answer;
    }
}