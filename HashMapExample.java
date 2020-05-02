//Import the HashMap class
import java.util.HashMap;
class HashMapExample{
	public static void main(String args[]){
	//Create a HashMap object called capitalCities
	HashMap<String,String> capitalCities = new HashMap<String,String>();
	
	//Add keys and values(Country, City)
	System.out.println("\n1-Adding elements in Empty HashMap");
	capitalCities.put("England","London");
	capitalCities.put("Germany","Berlin");
	capitalCities.put("Norway","Oslo");
	capitalCities.put("USA","Washington DC");
	System.out.println(capitalCities);
	
	//Access an Item in HashMap
	String string1 = capitalCities.get("England");
	System.out.println("\n2- Accessing and element form HashMap :");
	System.out.println("England : "+ string1);
	
	//Removing an element from HashMap 
	String string2 = capitalCities.remove("England");
	System.out.println("\n3- Removing an element from HashMap having key England ");
	System.out.println(capitalCities);
	
	//HashMap size
	System.out.println("\n4- Size of HashMap: " + capitalCities.size());
	
	//loop through the HashMap
	System.out.println("\n5- Looping through key values of HashMap");
	for(String i : capitalCities.keySet()){
		System.out.println(i);
	}
	
	System.out.println("\n6- Looping through values of HashMap");
	for(String i :  capitalCities.values()){
		System.out.println(i);
	}
	
	System.out.println("\n7- Looping through both key and values of HashMap");
	for(String i : capitalCities.keySet()){
		System.out.println("key - "+ i +"  value - " + capitalCities.get(i) );
	}
	
	}
}