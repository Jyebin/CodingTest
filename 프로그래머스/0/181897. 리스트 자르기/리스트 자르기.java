import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if(n == 1){
            //0번 인덱스부터 b번 인덱스까지
            for(int i=0; i<=b; i++){
                list.add(num_list[i]);
            }
        }
        if(n == 2){
            //a번부터 마지막 인덱스까지
            for(int i=a; i<num_list.length; i++){
                list.add(num_list[i]);
            }
        }
        if(n == 3){
            //a번부터 b번 인덱스까지
            for(int i=a; i<=b; i++){
                list.add(num_list[i]);
            }
        }
        if(n == 4){
            //a번 인덱스부터 b번 인덱스까지 c간격으로
            for(int i=a; i<=b; i+=c){
                list.add(num_list[i]);
            }
        }
        return list;
    }
}