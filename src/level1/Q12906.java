package level1;

// 같은 숫자는 싫어
// https://programmers.co.kr/learn/courses/30/lessons/12906

import java.util.*;

public class Q12906 {
    public static void main(String[] args) {
        int[] ex01 = {1, 1, 3, 3, 0, 1, 1};
        int[] ex02 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(new Q12906().solution(ex01)));
        System.out.println(Arrays.toString(new Q12906().solution(ex02)));
    }

    private int[] solution(int []arr) {
        if(arr.length < 2) return arr;

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] != arr[i])
                list.add(arr[i]);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
