class Solution {
    int answer = 0;

    void dfs(int[] numbers, int idx, int sum, int target) {

        // 모든 숫자를 다 썼을 때
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // + 선택
        dfs(numbers, idx + 1, sum + numbers[idx], target);

        // - 선택
        dfs(numbers, idx + 1, sum - numbers[idx], target);
    }

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }
}