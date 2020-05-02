class Animal{
	public void animalSound(){
		System.out.println("The animal makes a sound");
	}
}
class Pig extends Animal{
	public void animalSound(){
		System.out.println("The pig says: wee wee");
	}
}
class Dog extends Animal{
	public void animalSound(){
		System.out.println("The dog says: bow wow");
	}
}
class MyMainClass{
	public static void main(String[] args){
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myPig = new Pig(); //Create a pig object 
		Animal myDog = new Dog(); //Create a dog object 
		/*
		incompatible types: Animal cannot be converted to pig
		Pig new_pig = new Animal();
		new_pig.animalSound();
		*/
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}