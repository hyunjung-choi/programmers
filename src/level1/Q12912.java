package level1;

// 두 정수 사이의 합
// https://programmers.co.kr/learn/courses/30/lessons/12912

public class Q12912 {
    public static void main(String[] args) {
        Q12912 ex = new Q12912();

        System.out.println(ex.solution(3, 5)); // 12
        System.out.println(ex.solution(3, 3)); // 3
        System.out.println(ex.solution(5, 3)); // 12
    }

    public long solution(int a, int b) {
        if(a == b) return a;

        long answer = 0;
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);

        for(int i = smaller; i <= bigger; i++) {
            answer += i;
        }

        return answer;
    }
}
