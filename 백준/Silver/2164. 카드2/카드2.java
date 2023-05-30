import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	Integer temp;
    
    	
    	
    	for(int i =1; i<=n; i++) {
    		q.add(i);
    		
    	}
    	
    	while(q.size() > 1) {
	    		q.poll();	
	    		temp = q.peek();
	    		q.poll();
	    		q.add(temp);
    		
    	}

    	
    	System.out.println(q.peek());
		
	}

}
