import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n 팩토리얼 값을 구한다.
        BigInteger mu = BigInteger.ONE;

        for (int i = n; i > 0; i--) {
            mu = mu.multiply(BigInteger.valueOf(i));
        } // 팩토리얼 계산

        int[] arr = Stream.of(mu.toString().split(""))
                .mapToInt(Integer::parseInt)
                .toArray(); // 배열 변환

        int count = 0;
        for (int i = 0; i < arr.length; i++) { // 끝 자리수 확인
            if (arr[arr.length - 1 - i] == 0) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}






