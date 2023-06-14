package programmers.level1;

/**
 * 
 * <문제 설명>
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 
 * <제한사항>
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
public class Soluation_12944 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int[] arr = { 1, 2, 3, 4 };

		double answer = getAnswer(arr);
		System.out.println(answer);
	}

	private static double getAnswer(int[] arr) {
		double sum = 0;
		double answer = 0;
		for (int i = 0, size = arr.length; i < size; i++) {
			sum += arr[i];
		}

		answer = sum / arr.length;
		return answer;
	}
}
