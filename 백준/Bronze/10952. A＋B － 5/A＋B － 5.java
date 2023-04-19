import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
				
		while(true){           //와일문 다시 보기
		
			int A=in.nextInt();
			int B=in.nextInt();
		
			if(A==0 && B==0){
				in.close();
				break;
			}
			System.out.println(A+B);
		}
	}
}