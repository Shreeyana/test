package assaignment;

import java.util.Scanner;

public class AssaignmentOne {


	  static int abc[] = new int[]{1,0};
	
	static int[] solutions(int[] numbers,int n) {
		int arr[] =new int[n];
		 int i = 0;
		 
		while(i<n-2) {
			int j = i+1;
				while(j<n-1) {
					int k=j+1;
	                while(k<n){

	                    System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
	                    
	                    if(numbers[i]<numbers[j] && numbers[j]>numbers[k] ) {
	                    	arr[i]=abc[0];
	                    }else if(numbers[i]>numbers[j] && numbers[j]<numbers[k]) {
	                    	arr[i]=abc[0];
	                    }
	                    else {
	                    	arr[i]=abc[1];
	                    }
	                    
	                    i++;
	                    j++;
	                    k++;
	                }
	                
	            }
	        }
		  
		 return arr;
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int result[]=new int[n-2];
		for(int i=0;i<n;i++) {
			 arr[i]=scanner.nextInt();
//			System.out.println(arr[i]);
		}
		result=solutions(arr,n);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
	}

}

//for (int i = 0; i < n - 2; i++) {
//    for (int j = i + 1; j < n - 1; j++) {
//        for (int k = j + 1; k < n; k++){
//            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//        }
//    }
//}
