

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int count=0;
	static int n=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine()); // 케이스

		while (t-- >0) {

			n = Integer.parseInt(br.readLine()); // 정수 n 개

			resum(0);
			bw.write(count + "\n");
			count = 0;

		}
		bw.close();

	}

	private static void resum(int sum) {
		if (sum == n) {
			count++;
			return;
		} else if (sum > n)
			return;

		resum(sum + 1);
		resum(sum + 2);
		resum(sum + 3);

	}

}
