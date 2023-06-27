import java.util.PriorityQueue;
 
class Solution {
 public int solution(int[] scoville, int K) {
		 PriorityQueue<Integer> q = new PriorityQueue<>();
		 for(int s : scoville) {
			 q.add(s);
		 }
		 
		 int count = 0 ;
		 
		 while(q.size() > 1 && q.peek()<K) {
			 q.add(q.remove() + q.remove() *2);
			 
			 count ++;
		 }
		 
		return q.peek() >= K ? count : -1;
	      
	    }
	}