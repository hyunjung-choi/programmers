package level1;

// 하샤드 수
// https://programmers.co.kr/learn/courses/30/lessons/12947

public class Q12947 {
    public boolean solution(int x) {
        boolean answer = true;
        if(x % digitSum(x) != 0)
            return false;
        return answer;
    }

    private int digitSum(int x) {
        int sum = 0;
        while(x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
