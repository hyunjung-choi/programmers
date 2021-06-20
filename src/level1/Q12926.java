package level1;

// 시저 암호
// https://programmers.co.kr/learn/courses/30/lessons/12926

public class Q12926 {
    public String solution(String s, int n) {
        String answer = "";
        char[] chArr = s.toCharArray();

        for(char c : chArr) {
            if(c == ' ') {
                answer += " ";
                continue;
            }
            // 대문자인 경우
            if(c >=65 && c <= 90) {
                c += n;
                if(c > 90) {
                    c -= 26;
                }
            }

            // 소문자인 경우
            if(c >= 97 && c <= 122) {
                c += n;
                if(c > 122) {
                    c -= 26;
                }
            }
            answer += Character.toString(c);
        }
        return answer;
    }
}
