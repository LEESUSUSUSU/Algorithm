


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[31]; // 1~ 30까지 배열 만들어 주기
		int student = 0;

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i; // 배열에 1~ 30까지 넣어주기

		}

		for (int s = 1; s < arr.length-2; s++) {

			student = sc.nextInt(); // 제출 하는 학생의 번호

			if (arr[student] == student) { // 제출 하는 학생의 번호는 0으로 바꿈

				arr[student] = arr[0];
			}
		}


		for (int st = 1; st < arr.length; st++) { // 0 이상의 배열만
			if (arr[st] > 0) {              

				System.out.println(arr[st]);       //짜피 순서대로 배열을 넣어서 확인해서 0으로 변환했기 때문에 순서에 맞게 출력됨.

			}

		}

	}
}
