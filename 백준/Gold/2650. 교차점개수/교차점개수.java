

import java.util.Scanner;

class Main {
	static class Point {
		int first, second;

		public Point(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	static class Pair {
		Point first, second;

		public Pair(Point first, Point second) {
			this.first = first;
			this.second = second;
		}
	}

	static int N;
	static Pair[] point;

	static boolean cw(Point a, Point b) {
		if (a.first < b.first)
			return false;
		if (a.first > b.first)
			return true;
		if (a.first < 3)
			return a.second > b.second;
		return a.second < b.second;
	}

	static boolean check(int a, int b) {
		Point p1 = point[a].first;
		Point p2 = point[a].second;
		Point p3 = point[b].first;
		Point p4 = point[b].second;
		boolean c13 = cw(p1, p3);
		boolean c23 = cw(p2, p3);
		boolean c14 = cw(p1, p4);
		boolean c24 = cw(p2, p4);
		return (c13 ^ c23) ^ (c14 ^ c24);
	}

	static int convert(int a) {
		if (a == 3)
			return 1;
		if (a == 2)
			return 2;
		if (a == 1)
			return 4;
		return 3;
	}

	static void answer() {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		N /= 2;
		point = new Pair[N];

		for (int i = 0; i < N; i++) {
			int a1 = scanner.nextInt();
			int b1 = scanner.nextInt();
			a1 = convert(a1);
			int a2 = scanner.nextInt();
			int b2 = scanner.nextInt();
			a2 = convert(a2);
			point[i] = new Pair(new Point(a1, b1), new Point(a2, b2));
		}

		int ret = 0, ans = 0;
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				if (check(i, j)) {
					tmp++;
				}
			}
			ret += tmp;
			ans = Math.max(ans, tmp);
		}
		System.out.println(ret / 2);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		answer();
	}
}
