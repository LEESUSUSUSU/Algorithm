

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

//        int a = 1;
//        int b = 5;
        int count = 0;

        int[] dong = new int[m];

//        for (int i = 0; i < m; i++) {
//            if (i % 2 != 0) {
//                dong[i] = a;
//                a *= 10;
//            } else {
//                dong[i] = b;
//                b *= 10;
//            }
//        }
        
        for (int i = 0; i < m; i++)
        	dong[i] = Integer.parseInt(br.readLine());

        for (int i = m - 1; i >= 0; i--) {
            if (dong[i] <= money) {
                count += money / dong[i];
                money = money % dong[i];
            }
        }

        System.out.println(count);
    }
}
