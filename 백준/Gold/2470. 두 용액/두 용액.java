

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static int temp = 1;
	static StringBuilder sb;
	static int i = 0;
	static int j = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int s = 0;
		int u = n - 1;

		int y =0;
		int e = 0;

		int min = Integer.MAX_VALUE;

		while (s < u) {

			int sum = arr[s] + arr[u];

			if (Math.abs(sum) < min) {
				min = Math.abs(sum);

				y = arr[s];
				e = arr[u];

			}
			if (sum < 0) {
				s++;
			} else
				u--;

		}

		System.out.print(y + " " + e);

	}

}
