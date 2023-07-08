

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] block;
    static int ownCount = 0;
    static int zCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        block = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                block[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0, 0, N);
        System.out.println(ownCount);
        System.out.println(zCount);
    }

    public static void cutPaper(int x, int y, int size) {
        if (check(x, y, size)) {
            if (block[x][y] == 0) {
                ownCount++;
            } else {
                zCount++;
            }
            return;
        }

        int newSize = size / 2;
        cutPaper(x, y, newSize);
        cutPaper(x, y + newSize, newSize);
        cutPaper(x + newSize, y, newSize);
        cutPaper(x + newSize, y + newSize, newSize);
    }

    public static boolean check(int x, int y, int size) {
        int color = block[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (block[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
