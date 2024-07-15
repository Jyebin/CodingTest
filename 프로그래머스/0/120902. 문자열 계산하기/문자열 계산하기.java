class Solution {
    public int solution(String my_string) {
        
        String[] arr = my_string.split(" ");
        int length = arr.length;
        int answer = Integer.parseInt(arr[0]);
        
        for(int i=1;i<length-1;i++){
            if(arr[i].equals("+")){
                answer = answer + Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer = answer - Integer.parseInt(arr[i+1]);
            }
        }
        return answer;
    }
}