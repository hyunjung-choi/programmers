package level1;

// 가운데 글자 가져오기
// https://programmers.co.kr/learn/courses/30/lessons/12903

public class Q12903 {
    public static void main(String[] args) {
        Q12903 ex1 = new Q12903();

        System.out.println(ex1.solution("abcde")); // c
        System.out.println(ex1.solution("qwer")); // we
    }

    public String solution(String s) {
        if(s.length() == 1) return s;

        String answer = "";

        if (s.length() % 2 != 0) {
            answer = Character.toString(s.charAt(s.length()/2));
        } else {
            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
        }
        return answer;
    }
}
