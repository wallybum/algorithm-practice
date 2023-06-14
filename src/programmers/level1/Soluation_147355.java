package programmers.level1;

/**
 * <문제 설명>
 * 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
 * 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 
 * return하는 함수 solution을 완성하세요.
 * 
 * 예를 들어, t="3141592"이고 p="271" 인 경우,
 * t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
 * 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
 * 
 * <제한사항>
 * 1 ≤ p의 길이 ≤ 18 p의 길이 ≤ t의 길이 ≤ 10,000 t와
 * p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class Soluation_147355 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {

		String t = "3141592";
		String p = "271";

		int digit = p.length();
		long num = Long.parseLong(p);
		int result = 0;

		for (int i = 0; i < t.length() - p.length() + 1; i++) {
			long diff = Long.parseLong((t.substring(i, i + digit)));

			if (diff <= num) {
				result++;
			}
		}

		System.out.println(result);
	}

}
