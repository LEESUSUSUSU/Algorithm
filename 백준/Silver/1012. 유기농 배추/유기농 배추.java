

import java.awt.image.ByteLookupTable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static final int dx[] = { 0, -1, 1, 0 }; // 배열 안에서 움직이기.
	private static final int dy[] = { -1, 0, 0, 1 };

	static boolean[][] check;
	static int[][] arr;
	static int count;

	static int sol;
	static int col;

	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st ;

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			sol = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			int bach = Integer.parseInt(st.nextToken());
			
			count =0;

			arr = new int[sol][col];
			check = new boolean[sol][col];

			for (int j = 0; j < bach; j++) {
				st = new StringTokenizer(br.readLine(), " ");

				int point1 = Integer.parseInt(st.nextToken());
				int point2 = Integer.parseInt(st.nextToken());

				arr[point1][point2] = 1;

			}

			for (int x = 0; x < sol; x++) {
				for (int y = 0; y < col; y++) {
					if (arr[x][y] == 1 && !check[x][y]) {
						dfs(x, y);
						count++;

					}

				}
			}
			System.out.println(count);
		}
		

	}

	private static void dfs(int x, int y) {
		check[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int checkX = x + dx[i];
			int checkY = y + dy[i];

			if (checkX >= 0 && checkY >= 0 && checkX < sol && checkY < col) {
				if (!check[checkX][checkY] && arr[checkX][checkY] == 1) {
					dfs(checkX, checkY);

				}
			}

		}

	}

}
