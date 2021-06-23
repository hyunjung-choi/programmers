package level1;

// 키패드 누르기
// https://programmers.co.kr/learn/courses/30/lessons/67256

public class Q67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int curLeft = 10, curRight = 12;

        for(int num : numbers) {
            if(num == 1 || num == 4 || num ==7) {
                answer.append("L");
                curLeft = num;
            } else if(num == 3 || num == 6 || num == 9) {
                answer.append("R");
                curRight = num;
            } else {
                // 2, 5, 8, 0인 경우
                int leftDistance = getDistance(num, curLeft);
                int rightDistance = getDistance(num, curRight);

                if(leftDistance == rightDistance) {
                    if(hand.equals("left")) {
                        answer.append("L");
                        curLeft = num;
                    }
                    if(hand.equals("right")) {
                        answer.append("R");
                        curRight = num;
                    }
                } else if(leftDistance < rightDistance) {
                    answer.append("L");
                    curLeft = num;
                } else {
                    answer.append("R");
                    curRight = num;
                }
            }
        }
        return answer.toString();
    }

    // 키패드 사이의 거리 구하기
    private int getDistance(int num, int current) {
        int[] coordinateOfNum = getCoordinate(num);
        int[] coordinateOfCurrent = getCoordinate(current);
        return Math.abs(coordinateOfNum[0] - coordinateOfCurrent[0]) +
                Math.abs(coordinateOfNum[1] - coordinateOfCurrent[1]);
    }

    // 번호를 좌표값으로 변환
    private int[] getCoordinate(int num) {
        if(num == 0)
            num = 11;
        int[] result = new int[2];
        result[0] = (num - 1) / 3;
        result[1] = (num - 1) % 3;
        return result;
    }
}
