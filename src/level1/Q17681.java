package level1;

// 비밀지도
// https://programmers.co.kr/learn/courses/30/lessons/17681

public class Q17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            map1[i] = convertToBinary(n, arr1[i]);
            map2[i] = convertToBinary(n, arr2[i]);
        }

        // System.out.println(Arrays.toString(map1));
        // System.out.println(Arrays.toString(map2));

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < n; j++) {
                if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

    private String convertToBinary(int n, int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(binary);

        while(sb.length() != n) {
            sb.insert(0, "0");
        }
        return sb.toString();
    }
}
