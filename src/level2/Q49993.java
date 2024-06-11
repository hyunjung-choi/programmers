package level2;

import java.util.Arrays;

/**
 * 스킬트리
 * https://school.programmers.co.kr/learn/courses/30/lessons/49993
 */

public class Q49993 {
    public int solution(String skill, String[] skillTrees) {
        return (int) Arrays.stream(skillTrees)
                .map(s -> s.replaceAll("[^" + skill + "]", ""))
                .filter(skill::startsWith)
                .count();
    }
}