package level1;

// 콜라츠 추측
// https://programmers.co.kr/learn/courses/30/lessons/12943

public class Q12943 {
    public int solution(int num) {
        int count = 0;
        return collatz(num, count);
    }

    private int collatz(long num, int count) {
        while(count <= 500) {
            if(num == 1) break;
            if(num % 2 == 0) {
                num /= 2;
                return collatz(num, ++count);
            } else {
                num = num * 3 + 1;
                return collatz(num, ++count);
            }
        }
        if(count >= 500) return -1;

        return count;
    }
}
