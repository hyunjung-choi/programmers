package level1;

// 나누어 떨어지는 숫자 배열
// https://programmers.co.kr/learn/courses/30/lessons/12910

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q12910 {
    public static void main(String[] args) {
        int[] ex01 = {5, 9, 7, 10};
        int[] ex02 = {2, 36, 1, 3};
        int[] ex03 = {3, 2, 6};

        System.out.println(Arrays.toString(new Q12910().solution(ex01, 5)));
        System.out.println(Arrays.toString(new Q12910().solution(ex02, 1)));
        System.out.println(Arrays.toString(new Q12910().solution(ex03, 10)));
    }

    private int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int num : arr) {
            if(num % divisor == 0)
                answer.add(num);
        }

        if(answer.size() == 0)
            answer.add(-1);
        else
            Collections.sort(answer);

        return listToArr(answer);
    }

    private int[] listToArr(List<Integer> list) {
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
