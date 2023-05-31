

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String fn ="long int";
		String fns ="";
		
		if(n ==4) {
			System.out.println(fn);
		}else {
			for(int i=0; i<n/4-1; i++) {
				
				fns += "long ";
			}
			System.out.println(fns+fn);
		}
		
		}
	}


