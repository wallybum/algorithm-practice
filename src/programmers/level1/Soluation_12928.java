package programmers.level1;

/**
 * <문제 설명>
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * 
 * <제한 사항>
 * n은 0 이상 3000이하인 정수입니다.
 *
 */
public class Soluation_12928 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int n = 12;
		int answer = 0;
		int divideNumber = 1;
		while (n != 0) {
			if (divideNumber > n) {
				break;
			}
			if (n % divideNumber == 0) {
				answer += divideNumber;
			}
			divideNumber++;
		}

		System.out.println(answer);
	}
}
