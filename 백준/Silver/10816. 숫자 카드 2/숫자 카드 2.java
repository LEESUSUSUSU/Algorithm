

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		String[] input = br.readLine().split(" ");

		HashMap<String, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String num = input[i];
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		int m = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			String num = input1[i];
			int count = frequencyMap.getOrDefault(num, 0);
			sb.append(count).append(" ");
		}

		System.out.println(sb);
	}
}
