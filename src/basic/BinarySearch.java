package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class BinarySearch {
	public static void main (String[] args) {
		ArrayList<Integer> arr =new ArrayList<>();
		arr.add(1); 
		arr.add(2); 
        arr.add(10); 
        arr.add(20); 
		arr.add(3); 
		arr.add(10); 
//        int index = Collections.binarySearch(arr, 10); 
//        System.out.println(index);  
	    System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        PriorityQueue<Integer> que=new PriorityQueue<>();
        que.offer(1);
        que.offer(10);
        que.offer(19);
        que.offer(12);
        que.offer(9);
        
        System.out.println(que);
        
	}


	
	 
}
