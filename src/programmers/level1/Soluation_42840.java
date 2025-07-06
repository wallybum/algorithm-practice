package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/*
 * 수포자는 수학을 포기한 사람의 준말입니다.
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
public class Soluation_42840 {
    public static void main(String[] args) {

        int[] answer = new int[] { 1, 3, 2, 4, 2, 1, 2, 3, 4, 5, 6, 7, 1, 2, 2, 3, 4, 5, 3 };
        run(answer);
    }

    private static void run(int[] answer) {
       
        int[] p1 = getPattern1(answer.length);
        int[] p2 = getPattern2(answer.length);
        int[] p3 = getPattern3(answer.length);

        int score1 = 0, score2 = 0, score3 = 0;


        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == p1[i]) score1++;
            if (answer[i] == p2[i]) score2++;
            if (answer[i] == p3[i]) score3++;
        }

        int max = Math.max(score1, Math.max(score2, score3));

        List<Integer> result = new ArrayList<>();
        if (score1 == max) result.add(1);
        if (score2 == max) result.add(2);
        if (score3 == max) result.add(3);

        System.out.println(result.stream().mapToInt(Integer::intValue).toArray());
     


    }
 public static int[] getPattern1(int length) {
        int[] pattern = {1, 2, 3, 4, 5};
        return generateAnswers(pattern, length);
    }

    public static int[] getPattern2(int length) {
        int[] pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        return generateAnswers(pattern, length);
    }

    public static int[] getPattern3(int length) {
        int[] pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        return generateAnswers(pattern, length);
    }

    private static int[] generateAnswers(int[] pattern, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = pattern[i % pattern.length];
        }
        return result;
    }

}
