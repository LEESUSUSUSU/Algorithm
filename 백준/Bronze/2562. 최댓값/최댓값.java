


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9]; // n 수 만큼 배열을 만들어 준다.

		for (int i = 0; i < 9; i++) {

			arr[i] = sc.nextInt();
		}

		int max = arr[0]; // 최대값을 max 를 초기화 해준다.
		int num = 0; // i 값을 넣어줄 번호

		for (int i = 1; i < 9; i++)

			if (max < arr[i]) {

				max = arr[i];

			}

		System.out.println(max);

		for (int i = 1; i < 9; i++)

			if (max == arr[i]) {
				num = i;

			}

		System.out.println(num+1);

	}
}
