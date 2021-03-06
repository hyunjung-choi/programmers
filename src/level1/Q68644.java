package level1;

// 두 개 뽑아서 더하기
// https://programmers.co.kr/learn/courses/30/lessons/68644

import java.util.*;

public class Q68644 {

    public static void main(String[] args) {
        Q68644 ex1 = new Q68644();
        Q68644 ex2 = new Q68644();

        System.out.println(Arrays.toString(ex1.solution(new int[]{2, 1, 3, 4, 1}))); // [2,3,4,5,6,7]
        System.out.println(Arrays.toString(ex2.solution(new int[]{5, 0, 2, 7}))); // [2,5,7,9,12]
    }

    public int[] solution(int[] numbers) {
        if (numbers == null || numbers.length == 0) return new int[0];

        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                result.put(sum, result.getOrDefault(sum, 1));
            }
        }

        int[] answer = new int[result.size()];

        int i = 0;
        for (int n : result.keySet()) {
            answer[i] = n;
            i++;
        }

        Arrays.sort(answer);
        return answer;
    }
}