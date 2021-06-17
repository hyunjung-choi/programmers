package level1;

// x만큼 간격이 있는 n개의 숫자
// https://programmers.co.kr/learn/courses/30/lessons/12954

import java.util.ArrayList;
import java.util.List;

public class Q12954 {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        long element = x;

        for(int i = 0; i < n; i++) {
            answer.add(element);
            element += x;
        }

        return answer;
    }
}
