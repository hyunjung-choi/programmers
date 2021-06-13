package level1;

// 제일 작은 수 제거하기
// https://programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q12935 {
    public int[] solution(int[] arr) {
        if(arr == null || arr.length <= 1)
            return new int[] {-1};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(Collections.min(list));
        return list.stream().mapToInt(i -> i).toArray();
    }
}
