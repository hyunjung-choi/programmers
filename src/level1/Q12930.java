package level1;

// 이상한 문자 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12930

public class Q12930 {
    public static void main(String[] args) {
        System.out.println(new Q12930().solution("try hello world"));
        System.out.println(new Q12930().solution("hello world        "));
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for(String word : words) {
            for(int i = 0; i < word.length(); i++) {
                if(i % 2 == 0)
                    answer.append(Character.toString(word.charAt(i)).toUpperCase());
                else
                    answer.append(Character.toString(word.charAt(i)).toLowerCase());
            }
            answer.append(" ");
        }
        answer.delete(answer.length() - 1, answer.length());

        return answer.toString();
    }
}
