package oopconcepts;

public class Car {
	 //color
	private String color;
	//body
	private String body;
	//make
	private String make;
	//model
	private String model;
	  
	private int year;
	int speed;
	int gear;
	
//	public  void increaseSspeed()
//	{
//		System.out.println("Increse the speed of the car");
//	}
   public Car() {
	 this.speed=0;
	 this.gear=0;	  
}

   
    public Car( int speed,int gear) {
    	this.speed=speed;
    	this.gear=gear;
    }
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	

	public void setYear(int year) {
		if(year>=2000 ) {
			this.year = year;}

else {
	 this.year=5;
	System.out.println("this is not valid year");
}
		
	}
	public int getYear() {
		return year;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
