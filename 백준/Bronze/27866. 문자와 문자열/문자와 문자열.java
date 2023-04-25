

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		String s = sc.next();
		int n = sc.nextInt();
		
		System.out.println(s.charAt(n-1));
		
	}
}
	
//	public static void main(String[] args) throws IOException {
//		
//	  
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str =br.readLine().trim();
//		int idx = Integer.parseInt(br.readLine());
//		
//		System.out.println(str.substring(idx-1,idx));
//		
//	}
//}
