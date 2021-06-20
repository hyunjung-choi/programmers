package level1;

// 정수 내림차순으로 배치하기
// https://programmers.co.kr/learn/courses/30/lessons/12933

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q12933 {
    public long solution(long n) {
        String[] numbers = String.valueOf(n).split("");
        List<Integer> degit = devideDegit(numbers);
        degit.sort(Comparator.reverseOrder());
        StringBuilder result = new StringBuilder();
        for(int num : degit) {
            result.append(num);
        }
        return Long.parseLong(result.toString());
    }

    private List<Integer> devideDegit(String[] numbers) {
        List<Integer> degit = new ArrayList<>();
        for(String number : numbers) {
            degit.add(Integer.parseInt(number));
        }
        return degit;
    }
}
