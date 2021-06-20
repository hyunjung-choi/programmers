package level1;

// 자연수 뒤집어 배열로 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12932

import java.util.ArrayList;
import java.util.List;

public class Q12932 {
    public List<Integer> solution(long n) {
        List<Integer> answer = makeList(n);
        return answer;
    }

    private List<Integer> makeList(long n) {
        List<Integer> answer = new ArrayList<>();

        while(n / 10 != 0) {
            answer.add((int)(n % 10));
            n /= 10;
        }
        answer.add((int)n % 10);
        return answer;
    }
}
