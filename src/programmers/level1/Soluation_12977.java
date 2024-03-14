package programmers.level1;

/**
 * <문제 설명> 
 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
 * 
 * 자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록
 * solution 함수를 완성해주세요.
 *
 * <제한사항>
 * nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
 * nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */
public class Soluation_12977 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int[] nums = new int[] { 1, 2, 3, 4 };

		boolean isPrime = false;
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sumValue = nums[i] + nums[j] + nums[k];

					if (sumValue >= 2) {
						isPrime = checkPrime(sumValue);
					}

					if (isPrime) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}

	private static boolean checkPrime(int sumValue) {
		boolean isPrime = true;
		// 2는 무조건 소수
		if (sumValue == 2) {
			isPrime = true;
		} else {
			for (int i = 2; i < sumValue; i++) {
				if (sumValue % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}
