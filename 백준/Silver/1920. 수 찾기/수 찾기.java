

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NoSuchElementException,IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        String[] input = br.readLine().split(" "); 

        for (int i = 0; i < n; i++) {
            map.put(input[i], 1);
        }

        int m = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
           

            if (map.containsKey(input1[i])) {
                sb.append(map.get(input1[i])).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}
