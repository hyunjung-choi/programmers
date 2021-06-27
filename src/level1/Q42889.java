package level1;

// 실패율
// https://programmers.co.kr/learn/courses/30/lessons/42889

import java.util.*;

public class Q42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> players = new HashMap<>();
        Map<Integer, Integer> notClear = new HashMap<>();
        Map<Integer, Double> failure = new HashMap<>();

        for (int stage : stages) {
            for (int i = 1; i <= stage; i++) {
                players.put(i, players.getOrDefault(i, 0) + 1);
            }
            notClear.put(stage, notClear.getOrDefault(stage, 0) + 1);
        }

        // 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (!players.containsKey(i) || players.get(i) == 0 || !notClear.containsKey(i))
                failure.put(i, 0.0);
            else
                failure.put(i, (double) notClear.get(i) / players.get(i));
        }

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (int key : failure.keySet()) {
                if (max < failure.get(key)) {
                    max = failure.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            failure.remove(maxKey);
        }
        return answer;
    }
}
