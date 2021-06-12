package level1;

// 체육복
// https://programmers.co.kr/learn/courses/30/lessons/42862

import java.util.Arrays;

public class Q42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int attendStudents = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        attendStudents = borrow(lost, reserve, attendStudents);
        return attendStudents;
    }

    private int borrow(int[] lost, int[] reserve, int attendStudents) {
        // 여벌 체육복을 가져온 학생이 도난당한 경우를 우선순위로!
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i]) {
                    attendStudents++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] + 1 == lost[i] || reserve[j] - 1 == lost[i]) {
                    attendStudents++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        return attendStudents;
    }
}