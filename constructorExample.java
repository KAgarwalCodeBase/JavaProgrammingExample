//constructor example
class Car {
	int modelYear;
	String modelName;
	
	static{
		System.out.println("Hi I am static block");
	}
	Car(int year, String name)
	{
		this.modelYear = year;
		this.modelName = name;
		System.out.println("Hi, I am default constructor");
	}
	
	public static void main(String[] args){
		
		Car myCar = new Car(1969,"Mustang");
		System.out.println(myCar.modelYear + " "+myCar.modelName);
		
	}
}
