package assaignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssaignmentThree {

	
	
	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int M=scanner.nextInt();
		for(int i=0;i<n;i++) {
			 arr[i]=scanner.nextInt();

		}
		int N=arr.length;
		solution(arr,M,N);


	}

	static void solution(int[] arr, int M,int N) { 
		

		
		int i = 0;
		 
       
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
       
        int val = 0;
 
        
        for (; i < M; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            val = Math.max(val, map.get(arr[i]));
        }
        if(val>=2) {
        System.out.print(val + " ");
        }
        for (i = M; i < N; i++) {
 
        
            if (map.containsKey(i - M)) {
                map.put(i - M, map.get(i - M) - 1);
            	}
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            		} else {
                map.put(arr[i], 1);
            }
 
            val = 0;
 
           
            for (Map.Entry<Integer, Integer> x : map.entrySet()) {
                val = Math.max(val, x.getValue());
            }
            if(val>=2) {
                System.out.print(val + " ");
                }
            
	    }
	}
	}

