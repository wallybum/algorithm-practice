package programmers.level1;

import java.util.Arrays;

/**
 * <문제 설명>
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로
 * solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * 
 * <제한 사항>
 * 두 수는 1이상 1000000이하의 자연수입니다.
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */
public class Soluation_12940 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int n = 3;
		int m = 12;

		int[] answer = new int[2];
		answer[0] = getGCD(n, m);
		answer[1] = getLCM(n, m, answer[0]);

		System.out.println(Arrays.toString(answer));
	}

	/**
	 * 최대 공약수
	 */
	private static int getGCD(int n, int m) {
		while (m != 0) {
			int r = n % m;
			n = m;
			m = r;
		}
		return n;
	}

	/**
	 * 최소공배수
	 */
	private static int getLCM(int n, int m, int r) {
		return (n * m) / r;
	}
}
