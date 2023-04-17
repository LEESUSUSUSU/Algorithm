


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  

//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

		int num1, num2, num3;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		// num1 이 num2, num3 과 같을 경우
		if (num1 == num2 && num1 == num3) {

			System.out.println(10000 + (num1 * 1000));

			// 두개가 맞으면
		} else if (num1 == num2 || num1 == num3) {

			System.out.println(1000 + (num1 * 100));

		} else if(num2 == num3)  {

			System.out.println(1000 + (num2 * 100));
		}
		

		else if (num1 != num2 && num1 != num3) {

			if (num1 > num2 && num1 > num3) {

				System.out.println(num1 * 100);

			} else if (num2 > num1 && num2 > num3) {

				System.out.println(num2 * 100);

			} else {

				System.out.println(num3 * 100);
			}

		}

	}
}
