abstract class Animal {
	public abstract void animalSound();
	public static void sleep(){
		System.out.println("Zzz");
	}
	/*
	public static void main(String args[]){
		//Raise an error while creating object of abstract class
		//Animal obj = new Animal();
		System.out.println("This is an abstract method");
		Animal.sleep();
	}*/
}
class Pig extends Animal{
	public void animalSound(){
		System.out.println("The pig says : wee wee");
	}
}

class MyMainClass{
	public static void main(String[] args){
		Pig myPig = new Pig(); //Create a Pig object 
		myPig.animalSound();
		myPig.sleep();
	}
}