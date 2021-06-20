package level1;

// 문자열 다루기 기본
// https://programmers.co.kr/learn/courses/30/lessons/12918

public class Q12918 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            char[] chArr = s.toCharArray();
            for(char c : chArr) {
                if(!Character.isDigit(c)) return false;
            }
            return true;
        }
        return false;
    }
}
