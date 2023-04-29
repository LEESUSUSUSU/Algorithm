

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt(); // 몇 번을 실행할지.

		for (int i = 0; i < count; i++) {

			String arr = sc.next(); // 스트링으로 받기

			// String.valueOf() input.charAt(0)인 char타입을 String 데이터로 형변환
			// input이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환

			String f = String.valueOf(arr.charAt(0));
			String e = String.valueOf(arr.charAt(arr.length() - 1));
			System.out.println(f + e);

		}

	}
}
