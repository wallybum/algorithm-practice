package programmers.level1;

import java.util.Arrays;

/**
 * <문제 설명>
 * 함수 solution은 정수 x와 자연수 n을 입력 받아,
 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 *  다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 
 * <제한 조건>
 * x는 -10000000 이상, 10000000 이하인 정수입니다. n은 1000 이하인 자연수입니다.
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Soluation_12954 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int x = 2;
		int n = 5;

		long[] answer = new long[n];
		answer[0] = x;
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		System.out.println(Arrays.toString(answer));
	}
}
