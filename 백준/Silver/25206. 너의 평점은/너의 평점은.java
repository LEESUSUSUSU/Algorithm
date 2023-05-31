

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		float[] Credit = { 4.5F, 4.0F, 3.5F, 3.0F, 2.5F, 2.0F, 1.5F, 1.0F, 0.0F};
		String[] grade = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F","P"};
		float sum = 0.0f;
		float sum1 = 0.0f;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 20; i++) {
			String[] arr = br.readLine().split(" ");

			if (!arr[2].equals("P")) {

				int jidx = Arrays.binarySearch(grade, arr[2]);

				sum += Float.parseFloat(arr[1]);
				sum1 += Float.parseFloat(arr[1]) * Credit[jidx];
			}
		}

		System.out.printf("%.6f%n", sum1 / sum);

	}

}
