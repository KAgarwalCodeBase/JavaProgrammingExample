enum Level {
	LOW,
	MEDIUM,
	HIGH
}

class EnumExample{
	public static void main(String[] args){
		Level myVar = Level.MEDIUM;
		
		switch(myVar){
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Medium Level");
				break; 
			case HIGH:
				System.out.println("High Level");
				break;
		}
		
		System.out.println("\n\nLoop through the Enum");
		for(Level k : Level.values()){
			System.out.println(k);
		}
	}
}