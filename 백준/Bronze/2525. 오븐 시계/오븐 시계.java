


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h, m, mm;
		h = sc.nextInt();
		m = sc.nextInt();
		
		mm = sc.nextInt();
		
		h += mm / 60 ;
		m += mm % 60;
		
		if(m >= 60) {
			h += 1;
			m -= 60;
			
		}
		
		if(h >= 24) {
			h -= 24;
			
		}
		
		System.out.println(h + " " + m);
		
	}
}


//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//
//		int A = in.nextInt(); // 시
//		int B = in.nextInt(); // 분
//		int C = in.nextInt(); // 주어진 시간.
//
//		// 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
//		// (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
//
//		if (A < 23) {
//			A = A * 60 + (B + C);
//			B = A % 60;
//
//			System.out.println(A / 60 + " " + B);
//
//		}else {
	      
//		      if(A>=23) {
//		    	  
//		    	    A =0;
//		    	    A = A * 60 + (B + C);
//		         	B = A % 60;
//		         	
//			      A = A/60; 
//			      A--;
//			  
//		   }
//			System.out.println(A  + " " + B);
//		}
//
//	}
//}
