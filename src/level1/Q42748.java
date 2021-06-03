package level1;
// https://programmers.co.kr/learn/courses/30/lessons/42748

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q42748 {
    public static void main(String[] args) {
        Q42748 solution = new Q42748();

        System.out.println(Arrays.toString(solution.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public int[] solution(int[] array, int[][] commands) {
        if(array == null || array.length == 0 || commands == null || commands.length ==0)
            return new int[]{0};

        int[] answer = new int[commands.length];
        List<Integer> partOfArray;

        for(int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            partOfArray = devideArray(array, i, j);
            answer[x] = partOfArray.get(k - 1);
        }

        return answer;
    }

    private List<Integer> devideArray(int[] array, int i, int j) {
        List<Integer> result = new ArrayList<>();

        for(int x = 0; x < array.length; x++) {
            if(x >= i - 1 && x <= j - 1) {
                result.add(array[x]);
//                System.out.println(result.toString());
            }
        }
        Collections.sort(result);
        return result;
    }
}
