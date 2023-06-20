

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];

        System.out.println(rearr(n));
    }

    private static int rearr(int remain) {
        if (remain == 1)
            return 1;
        if (remain == 2)
            return 2;

        if (arr[remain] != 0)
            return arr[remain];

        arr[remain] = (rearr(remain - 1) + rearr(remain - 2)) % 10007;
        return arr[remain];
    }
}
