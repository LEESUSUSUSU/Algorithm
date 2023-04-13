import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		char grade = 0;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		if (a > 0 && b > 0) {
			grade = '1';
		} else if (a < 0 && b > 0) {
			grade = '2';
		} else if (a < 0 && b < 0) {
			grade = '3';
		} else if (a > 0 && b < 0) {
			grade = '4';

		}
		System.out.println(grade);

	}
}
