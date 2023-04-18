


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
	
		
		//구매한 각 물건의 가격과 개수
		//구매한 물건들의 총 금액

		
	
		int total = sc.nextInt();  // 영수증의 총 합
		int conut = sc.nextInt(); // 물건의 수량
		

		
		
		for(int i = 0 ; i<conut; i++) {
			
			int price = sc.nextInt(); //물건의 가격
			int temp = sc.nextInt(); // 물건의 수량
		
			total = total-(price*temp);
			
		}
		
		if(total == 0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
			
		}
		

	}

}
