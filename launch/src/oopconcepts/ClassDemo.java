package oopconcepts;

public class ClassDemo {
   
 public static void main(String[] args) {
	 Read();
		display();
	}
	public static void display() {
		int sum,a = 5,b=10,c=50;
		int diff;
		sum = a+b+c;
		diff =c-b-a;
		System.out.println("Difference of two Numbers:"+ diff);
		System.out.println("sum of two numbers is:"+sum);
	}
	public static void Read() {
		String stuname="Shreeyana";
		int marks=90;
		String grade="A";	
		System.out.println("student details "+stuname +marks +grade );
	}
			
	}
	
	


