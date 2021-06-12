package level2;

// 타겟 넘버
// https://programmers.co.kr/learn/courses/30/lessons/43165

public class Q43165 {

    private static int count = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, numbers[0]);
        dfs(numbers, target, 0, -numbers[0]);

        return count;
    }

    private void dfs(int[] numbers, int target, int i, int sum) {
        if(i == numbers.length - 1) {
            if(sum == target) count++;
            return;
        }

        dfs(numbers, target, i + 1, sum + numbers[i + 1]);
        dfs(numbers, target, i + 1, sum - numbers[i + 1]);

    }
}
