package level1;

// 서울에서 김서방 찾기
// https://programmers.co.kr/learn/courses/30/lessons/12919

public class Q12919 {
    public String solution(String[] seoul) {
        int location = -1;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                location = i;
                break;
            }
        }
        return "김서방은 " + location + "에 있다";
    }
}
