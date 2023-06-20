

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb;
	static int count = 0;

	static void move(int no, int x, int y) {

		if (no > 1)
			move(no - 1, x, 6 - x - y);

		sb.append(x + " " + y + "\n");
		count++;

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		move(n, 1, 3);

		System.out.println(count);
		System.out.println(sb);

	}

}
