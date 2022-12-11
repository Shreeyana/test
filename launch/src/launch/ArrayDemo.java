package launch;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		 int[] shree;
		 shree = new int[5];
		 shree[0]=100;
		 shree[1]=150;
		 shree[2]=10;
		 shree[3]=45;
		 shree[4]=15;
		 
		 
		 System.out.println("0 index :" + shree[0]);
		 System.out.println("1th index:" + shree[1]);
		 System.out.println("2 index :" + shree[2]);
		 System.out.println("3th index:" + shree[3]);
		 System.out.println("4th index:" + shree[4]);

			
			/*
			 * String[] shreestring; shreestring =new String[10];
			 * shreestring[0]="Shreeyana"; shreestring[1]="Kadel";
			 * System.out.println("jpt:"+ shreestring[0] + shreestring[1]);
			 * 
			 * String[] secondeg= {"hari","krishna","basnata"};
			 * System.out.println(secondeg[0]); System.out.println(secondeg[1]);
			 */
              int len1 =shree.length; 
              //int len2 =shreestring.length; int len3 =secondeg.length;
			  System.out.println("value Length:"+len1);
//			  System.out.println("String Length"+len2);
//			  System.out.println("srting length2:"+len3);
			
		  
		  for (int i=0 ;i<len1;i++) {
			  System.out.println("Before Sorting:" + shree[i]);
			  
		  }
		  Arrays.sort(shree);
		  for (int i=0 ;i<len1;i++) {
			  System.out.println("After Sorting:" + shree[i]);
			  
		  }
		  
	}

}
