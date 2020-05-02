import java.util.ArrayList;
import java.util.Collections; // for sorting ArrayList

public class ArrayListExample{
	public static void main(String args[]){
		ArrayList<String> cars = new ArrayList<String>();
		
		// Adding items inside ArrayList
		cars.add("Volvo");
		cars.add("RED BUS");
		cars.add("UPRTC");
		System.out.println("1- Elements in ArrayList");
		System.out.println(cars);
			
		//accessing an item present at particular index
		System.out.println("\n2- Accessing element present at 1 index "+ cars.get(1));
		
		//modifiying element present at 1 index
		cars.set(1,"MakeMyTrip Special");
		System.out.println("\n3- Printing elements after modifing element at index 1");
		System.out.println(cars);
		
		//removing an item present at index 1
		cars.remove(1);
		System.out.println("\n4- Printing ArrayList again after removing element present at index 1");
		System.out.println(cars);
		
		//accessing the size of ArrayList
		System.out.println("\n5- printing size of ArrayList using size funciton "+ cars.size());
		
		//looping through ArrayList using for loop 
		System.out.println("\n6- Printing the element of ArrayList using for loop");
		for (int i = 0; i < cars.size();i++ )
			System.out.println(cars.get(i));
		
		//looping through ArrayList using for each loop
		System.out.println("\n7- Printing the elements of ArrayList using looping through for each loop");
		for(String name : cars)
			System.out.println(name);
		
		//Creating a new ArrayList for Integer
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(10);
		Numbers.add(5);
		Numbers.add(17);
		Numbers.add(12);
		Numbers.add(30);
		Numbers.add(9);
		Numbers.add(18);
		System.out.println("\n8- Printing ArrayList of Integer");
		System.out.println(Numbers);
		
		//Sorting of ArrayList using Collections
		System.out.println("\n9- Sorting of ArrayList Using Collections Package");
		Collections.sort(cars);
		System.out.println(cars);
		Collections.sort(Numbers);
		System.out.println(Numbers);
		
		
		
	}
}