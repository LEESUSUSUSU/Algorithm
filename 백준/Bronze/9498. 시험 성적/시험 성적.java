import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		char grade;

		// 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();

		if (i >= 90) {
			grade = 'A';

		} else if (i >= 80) {
			grade = 'B';
		} else if (i >= 70) {
			grade = 'C';
		} else if (i >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);

	}
}
