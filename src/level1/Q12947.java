package level1;

// 하샤드 수
// https://programmers.co.kr/learn/courses/30/lessons/12947

public class Q12947 {
    public boolean solution(int x) {
        int s = String.valueOf(x).chars().map(Character::getNumericValue).sum();
        return x % s == 0;
    }
}
