import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        //실패율 = 도달했으나 아직 클리어 못한 수 / 도달한 수
        //N: 스테이지 개수
        //stages: 현재멈춰있는 스테이지
        //도달했으나 클리어 못한게 그냥 stages[i]
        //도달한 수는 음 ..
        int[] stage = new int[N+2]; //스테이지에 각 몇명 갔는지
        double[] silpae = new double[N+2];
        
        for(int i=0; i<stages.length; i++){
            //전체는 빼야하잖아 그치
            //n번스테이지에 몇명이갔는지를 담을 배열
            stage[stages[i]] = stage[stages[i]] + 1;
            // stages[i] / N
        }
        
        //실패율 구하기
        for(int i=1; i<=N; i++){ //각 스테이지 단계를 표시할것임
            int sum = 0;
            for(int j=1; j<i; j++){
                sum = sum + stage[j];
            }
            int human = stages.length - sum;
            
            if(human == 0){
                silpae[i] = 0;
            }else{
                silpae[i] = (double)stage[i] / human;
            }
        }
        //정렬
        //각 스테이지 번호를 실패율의 내림차순으로 정렬, 실패율이 같으면 작은 번호 스테이지가 먼저오게
        double[][] arr = new double[N][2];
        for(int i=0; i<N; i++){
            arr[i][0] = i + 1;
            arr[i][1] = silpae[i+1];
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]){
                return Double.compare(a[0], b[0]);
            }
            return Double.compare(b[1], a[1]);
        });
        
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = (int)arr[i][0];
        }
        
        return answer;
    }
}