

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static Integer[] memo; // 메모이제이션에 사용할 배열

    public static int dp(int n) {
        if (n <= 0) return 0; // n이 0 이하인 경우 0을 반환

        // 이미 계산한 값이 있는 경우 메모이제이션된 값을 반환
        if (memo[n] != null) return memo[n];

        // 현재 위치의 값과 이전 두 값 중에서 최대값을 선택하여 저장
        memo[n] = Math.max(dp(n - 2), dp(n - 3) + arr[n - 1]) + arr[n];
        return memo[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        memo = new Integer[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(dp(n));
    }
}
