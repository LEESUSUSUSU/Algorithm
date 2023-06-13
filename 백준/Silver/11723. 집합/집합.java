

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int s = 0;

		for (int i = 0; i < n; i++) {
			String[] put = br.readLine().split(" ");

			switch (put[0]) {
			case "all":
				s = (1 << 21) - 1;
				break;

			case "empty":
				s = 0;
				break;

			default:
				int x = Integer.parseInt(put[1]);

				switch (put[0]) {
				case "add":
					s |= (1 << x);
					break;
				case "remove":
					s &= ~(1 << x);
					break;
				case "check":
					if ((s & (1 << x)) != 0) {
						sb.append("1\n");
					} else {
						sb.append("0\n");
					}
					break;
				case "toggle":
					s ^= (1 << x);
					break;
				}
			}
		}

		System.out.println(sb.toString());
	}
}
