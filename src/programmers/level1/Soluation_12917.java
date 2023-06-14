package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * <문제 설명>
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요. s는
 * 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * 
 * <제한 사항>
 * str은 길이 1 이상인 문자열입니다.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
public class Soluation_12917 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String answer = "";
		String s = "Zbcdefg";

		String[] str = s.split("");

		Arrays.sort(str, Collections.reverseOrder());

		for (int i = 0, size = str.length; i < size; i++) {
			answer += str[i];
		}
		System.out.println(answer);
	}
}
