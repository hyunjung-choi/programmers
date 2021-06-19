package level1;

// 최대공약수와 최소공배수
// https://programmers.co.kr/learn/courses/30/lessons/12940

public class Q12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];

        return answer;
    }

    // 최대 공약수
    private int gcd(int n, int m) {
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
