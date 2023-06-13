
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int N;
	static int [] arr;
	static StringBuilder sb = new StringBuilder();
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		N = Integer.parseInt(br.readLine());

		arr = new int[N];

		for (int i = 0; i < N; i++) {

			arr[i] = Integer.parseInt(br.readLine());

		}

		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {

			sb.append(arr[i]).append("\n");

		}
		
		System.out.println(sb);

	}
}
