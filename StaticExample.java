class StaticExample{
	static int num = 10;
	static{
		System.out.println("This is static block");
	}
	public static void method1(){
		System.out.println("This is static method");
		System.out.println(num);
	
	}
	class NonStaticInnerClass{
		public void innerClassMethod()
		{
			System.out.println("This is non-static innerClass");
		}
	}
	static class StaticInnerClass{
		public void innerClassMethod(){
			System.out.println("This is static innerClass");
		}
	}
	
}
class MyMainClass{
	public static void main(String args[]){
		StaticExample obj = new StaticExample();
		obj.method1();
		StaticExample.NonStaticInnerClass obj2 = obj.new NonStaticInnerClass();
		obj2.innerClassMethod();
		StaticExample.StaticInnerClass obj3 = new StaticExample.StaticInnerClass();
		obj3.innerClassMethod();
	}
	
	
}