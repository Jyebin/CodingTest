class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("A")){
                arr[i] = "B";
            }else{
                arr[i] = "A";
            }
        }
        String str = "";
        for(int i=0; i<arr.length; i++){
            str += arr[i];
        }
        int answer = 0;
        if(str.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}