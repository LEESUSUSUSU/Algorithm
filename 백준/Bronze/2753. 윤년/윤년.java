import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		int year = 0;
		
		
		Scanner sc = new Scanner(System.in);
	
		
		for(; ;) {
			
			year = sc.nextInt();
			
			
			if(year % 4 == 0 && (year%100 != 0 || year % 400 == 0)) {
				System.out.println(1);  
				break;
			}
			else {
				System.out.println(0);
				break;
			}
			
		}
	}
}
