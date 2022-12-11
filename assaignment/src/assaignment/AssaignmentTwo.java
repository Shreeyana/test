package assaignment;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class AssaignmentTwo {
	


	public static void main(String[] args) {
		String result="";
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			 arr[i]=scanner.next();

		}
		result=solution(arr,4);
		System.out.println(result);
	}
	
	static String solution(String[] arr,int n) {
		String result="";
		String longest = Stream.of(arr).max(Comparator.comparingInt(String::length)).get();
	      for(int i = 0; i < longest.length(); i++) {
	    	  for(int j=0;j<arr.length;j++) {
	    		  if(i<arr[j].length())
	    		  result +=arr[j].charAt(i);
	    	  }
	    			  
	    	  }
	        System.out.println(result);
	    
		return result;
	   }
		
	}


