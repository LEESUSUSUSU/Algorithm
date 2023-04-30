import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();  // 몇 번 째까지 합을 구할 것인지.
		String a = in.next();  // 문자열로 받기
		in.close();
		
		int sum = 0;    //합을 구해줄 변수
        
		for(int i = 0; i < N; i++) {    // n번째까지 반복
			sum += a.charAt(i)-'0';   // -0 아스키문의 반환을 막기위함.
		}
		System.out.print(sum);
	}
}