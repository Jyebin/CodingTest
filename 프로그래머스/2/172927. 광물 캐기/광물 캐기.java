import java.util.Arrays;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        //광물을 5개씩 묶어서 정렬한 다음, 곡괭이로 가장 어려운 애들부터 자르기
        int len = minerals.length / 5; //5개씩 몇 묶음 나올지
        
        if(minerals.length % 5 != 0){
            len += 1;
        }
        
        int pickNum = picks[0] + picks[1] + picks[2]; //곡괭이 전체 개수
        //곡괭이 소진하면 끝나야 하므로
        len = Math.min(len, pickNum);
        int[][] arr = new int[len][3];
        
        for(int i=0; i<len; i++){
            int start = i*5;
            int end = Math.min(start+5, minerals.length);
            
            for(int j=start; j<end; j++){
                if(minerals[j].equals("diamond")){
                    arr[i][0] ++;
                }
                if(minerals[j].equals("iron")){
                    arr[i][1] ++;
                }
                if(minerals[j].equals("stone")){
                    arr[i][2] ++;
                }
            }
        }
        
        //피로도를 통해 힘든 정도를 판단하기
        Arrays.sort(arr, (b,a) -> {
            return (a[2] + a[1]*5 + a[0]*25) - (b[2] + b[1]*5 + b[0]*25); 
        });
        
        int answer = 0;
        for(int i=0; i<len; i++){
            int dia = arr[i][0];
            int iron = arr[i][1];
            int stone = arr[i][2];
            
            if(picks[0] > 0){ //다이아 곡괭이 있으면
                answer += dia + iron + stone;
                picks[0]--;
            }else if(picks[1] > 0){ //철 곡괭이 있으면
                answer += dia*5 + iron + stone;
                picks[1]--;
            }else if(picks[2] > 0){ //돌 곡괭이 있으면
                answer += dia*25 + iron*5 + stone;
                picks[2]--;
            }
        }
        
        return answer;
    }
}