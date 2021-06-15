package level1;

// 핸드폰 번호 가리기
// https://programmers.co.kr/learn/courses/30/lessons/12948

public class Q12948 {
    public String solution(String phone_number) {
        return hideNumber(phone_number);
    }

    private String hideNumber(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int startIndex = phone_number.length() - 4;
        String show = phone_number.substring(startIndex);
        sb.append("*".repeat(startIndex));
        sb.append(show);
        return sb.toString();
    }
}
