class Solution {
    int targetAns;
    int cnt;
    boolean[] visited;
    public int solution(int[] numbers, int target) {
        //하나씩 식을 계산해야 하므로 dfs이지만, 모든 조합을 탐색하는게 아니라 배열의 순서를 유지해야 함
        targetAns = target;
        dfs(numbers, 0, 0); //시작 index, 합계
        int answer = 0;
        answer = cnt;
        return answer;
    }
    void dfs(int[] numbers, int index, int sum){
        if(index == numbers.length){
            if(sum == targetAns){
                cnt++;
            }
            return;
        }
        dfs(numbers, index+1, sum + numbers[index]);
        dfs(numbers, index+1, sum - numbers[index]);
    }
}