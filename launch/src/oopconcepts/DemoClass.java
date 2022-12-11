package oopconcepts;
public class DemoClass {

	public static void main(String[] args) {
            Car abc =new Car();
            abc.setColor("Black");
            abc.setBody("Hatch");
            		abc.setMake("jordan");
            		abc.setModel("Model1");
            		abc.setYear(1990);
            		System.out.println("Car color:" +abc.getColor());
            		System.out.println("CarBody:" +abc.getBody());
            		System.out.println("Car Make:" +abc.getMake());
            		System.out.println("Car Model:" +abc.getModel());
            		System.out.println("Car year:"+ abc.getYear());
            		
          Car def =new Car();
          def.setColor("Red");
          def.setBody("Batch");
          def.setYear(1800);
          		def.setMake("Addidas");
          		def.setModel("Halkat");
          		System.out.println("Car color:" +def.getColor());
          		System.out.println("CarBody:" +def.getBody());
          		System.out.println("Car Make:" +def.getMake());
          		System.out.println("Car Model:" +def.getModel());
          		System.out.println("Car year:"+ def.getYear());
          //second ma kina na aako not valid  condition check
	}

}
