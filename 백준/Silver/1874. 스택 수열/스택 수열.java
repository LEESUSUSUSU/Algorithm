

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args)throws Exception {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); //임이의 수열이 주어졌을때
		Stack<Integer>stack = new Stack<>(); // 스택을 이용 하기위함
	
		int temp = 0;

		while(n-->0) {
			
			int va = Integer.parseInt(br.readLine());
			
		if(va > temp) {
			for(int i= temp+1; i<=va; i++) {
				stack.push(i);
				s.append('+').append('\n');
			}
			temp = va;
		}
		else if(stack.peek() != va)	{
			System.out.println("NO");
			return ;
		}
		
		stack.pop();
		s.append('-').append('\n');
		
		}
		
		System.out.println(s);
	
	}

}
