package level2;

// 기능개발
// https://programmers.co.kr/learn/courses/30/lessons/42586

import java.util.*;
import java.util.stream.Collectors;

public class Q42586 {

    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        System.out.println(solution(progresses1, speeds1)); // [2, 1]

        int[] progresses2 = {99, 99, 99, 98, 99, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses2, speeds2)); // [3, 3]

        int[] progresses3 = {96, 99, 98, 97};
        int[] speeds3 = {1, 1, 1, 1};
        System.out.println(solution(progresses3, speeds3)); // [4]
    }

    public static List<Integer> solution(int[] progresses, int[] speeds) {
        if(progresses == null || speeds == null || speeds.length == 0 || speeds.length != progresses.length) return new ArrayList<>();

        List<Integer> answer = new ArrayList<>();
        List<Integer> progress = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List<Integer> speed = Arrays.stream(speeds).boxed().collect(Collectors.toList());
        Queue<Integer> save = new LinkedList<>();

        while(!progress.isEmpty()) {
            tasking(progress, speed);
//            System.out.println(progress);

            while(progress.get(0) >= 100) {
                save.offer(progress.get(0));
                progress.remove(0);
                speed.remove(0);

                if(progress.isEmpty()) break;
            }

            if(!save.isEmpty()) {
                answer.add(save.size());
                save.clear();
            }
        }
        return answer;
    }

    private static void tasking(List<Integer> progress, List<Integer> speed) {
        for(int i = 0; i < progress.size(); i++) {
            if(progress.get(i) >= 100) {
                continue;
            }
            progress.set(i, progress.get(i) + speed.get(i));
        }
    }
}
