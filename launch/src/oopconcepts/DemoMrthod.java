package oopconcepts;

public class DemoMrthod {

	public static void main(String[] args) {
		 String grade;
		grade= anotherMethod(90);
		displayName("SHreeyana", grade);
		
		grade= anotherMethod(15);
		displayName("Ram", grade);

	}
	public static String anotherMethod(int score) {
		String grade;
		if (score>=90 && score<= 100) {
			grade="A";}
			else if (score > 70 && score<85) {
			grade="B";}
			else if(score>=50 && score<60) {
				grade="C";}
				else {
					grade="FAIL";}
		//" is: " lirako xaenaw
		
		return grade;
		
	}
		
 public static void displayName(String stuname, String grade) {
	 System.out.println("Grade Of "+ stuname +" is: " +  grade);
 }
}
	


