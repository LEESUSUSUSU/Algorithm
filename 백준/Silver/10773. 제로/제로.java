

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 점수 받기
		
		int sum = 0; // 팝 했을때 값을 더해줄 변수
		
		int ja = Integer.parseInt(br.readLine());    //값을 만들어준다.
		Stack<Integer>stack = new Stack<>();  // 
		
		for(int i=0; i< ja; i++) {
			int temp = Integer.parseInt(br.readLine());  //재현이 부른값을 받는다.
			
			if(temp == 0) {    //tmep 0이면 팝
				stack.pop();
			}
			else { 		// 아니면 push
				stack.push(temp);
			}
		}
		
		for(int num : stack) {    //stack을 넘에 넣어준다.
			
			sum +=num;
			
			
		}

		System.out.println(sum);   //sum호출 
	}

}
