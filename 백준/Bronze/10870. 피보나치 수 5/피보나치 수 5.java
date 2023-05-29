import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		recur(x);
		System.out.println(recur(x));
	}

	 static int recur(int x) {
		 
				if(x == 0) return 0;  //(𝐹0 = 0, 𝐹1 = 1)
				if(x == 1) return 1;
				
				
				//𝐹𝑛 = 𝐹𝑛-1 + 𝐹𝑛-2 
				return recur(x - 1) + recur(x - 2);
				
			}

	
		
	}


