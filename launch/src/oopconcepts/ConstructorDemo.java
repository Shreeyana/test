package oopconcepts;

public class ConstructorDemo {

	public static void main(String[] args) {
		Car c1= new Car();
		System.out.println("Executing without Argumets");
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		 Car c2 =new Car(5,1);
		System.out.println("Executing with  Arguments");
	    System.out.println(c2.speed);
	    System.out.println(c2.gear);
	}

}
