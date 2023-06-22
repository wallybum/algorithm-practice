package programmers.level1;

import java.util.Arrays;
import java.util.List;

/**
 * <문제 설명>
 * 문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.
 * 먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
 * 이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다.
 * 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
 * s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다.
 * 남은 부분이 없다면 종료합니다.
 * 만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면,
 * 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
 * 문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고,
 * 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.
 * 
 * <제한사항>
 *  1 ≤ s의 길이 ≤ 10,000 s는 영어 소문자로만 이루어져 있습니다.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */
public class Soluation_140108 {
	public static void main(String[] args) {
		String s = "abracadabra";
		run(s);
	}

	private static void run(String s) {
		List<String> splitList = Arrays.asList(s.split(""));

		int equalCount = 0;
		int notEqualCount = 0;
		int result = 0;
		int temp = 0;

		// abracadabra
		for (int i = 0; i < splitList.size(); i++) {
			char standardCharacter = s.charAt(temp);
			System.out.println("standardCharacter : " + standardCharacter);
			System.out.println("split : " + splitList.get(i));

			if (Character.toString(standardCharacter).equals(splitList.get(i))) {
				System.out.println("일치함");
				equalCount++;
			} else {
				System.out.println("일치하지않음.");
				notEqualCount++;
			}

			if (equalCount == notEqualCount) {
				temp = i + 1;
				result++;
			} else {
				if (i + 1 == splitList.size()) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}

/*
 * aaabbaccccabba 먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다. => a 이제 이 문자열을 왼쪽에서 오른쪽으로
 * 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을
 * 분리합니다.
 * 
 * => a(o) => a(o) => a(o) => b(x) => b(x) => a(o) => c(x) => c(x) 여기서 끊기.
 * 
 * 다시 읽기 (c) =>c (o) =>c (o) =>a (x) =>b (x)
 * 
 * 여기서 끊기
 * 
 *
 */