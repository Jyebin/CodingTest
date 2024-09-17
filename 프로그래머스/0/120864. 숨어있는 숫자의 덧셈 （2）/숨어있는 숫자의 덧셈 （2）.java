class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            char now = my_string.charAt(i);
            if(!Character.isDigit(now)){
                my_string = my_string.replace(Character.toString(now), " ");
            }
        }
        String[] arr = my_string.split(" ");
        for(int i=0; i<arr.length; i++){
            if(!arr[i].isEmpty()){
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}