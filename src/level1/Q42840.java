package level1;

// 모의고사
// https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q42840 {
    public List<Integer> solution(int[] answers) {
        List<Integer> student1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> student2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        List<Integer> student3 = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        int std1Count = 0, std2Count = 0, std3Count = 0;
        int length = answers.length;

        for(int i = 0; i < length; i++) {
            if(answers[i] == student1.get(i % student1.size())) {
                std1Count++;
            }
            if(answers[i] == student2.get(i % student2.size())) {
                std2Count++;
            }
            if(answers[i] == student3.get(i % student3.size())) {
                std3Count++;
            }
        }

        List<Integer> scores = new ArrayList<>(Arrays.asList(std1Count, std2Count, std3Count));

        System.out.println(scores);

        return compare(scores);
    }

    private List<Integer> compare(List<Integer> scores) {
        List<Integer> bestScore = new ArrayList<>();
        int max = Math.max(scores.get(0), Math.max(scores.get(1), scores.get(2)));
        for(int i = 0; i < scores.size(); i++) {
            if(scores.get(i) == 0) continue;

            if(max == scores.get(i))
                bestScore.add(i + 1);
        }
        return bestScore;
    }
}
