

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int[] arr1 = null;
        int[] arr2 = null;

        while (true) {
            String input = sc.next();
            if (input.equals("0")) {
                break;
            }

            arr1 = new int[input.length()];
            arr2 = new int[input.length()];

            for (int i = 0; i < input.length(); i++) {
                arr1[i] = Character.getNumericValue(input.charAt(i));
            }

            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[arr1.length - i - 1];
            }

            boolean same = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                	same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}