package java1_8_newfeaturesbydurga;

interface I{
	public void m1();
	public void m2();

	//Without effecting the implementations classes if we want to add new method to the interface >> use default methods.

	// default method cannot be used in the class.
	// Object class method we cannot implement using the default methods.
	default void m3(){}
}

class Test1 implements I {
	public void m1(){
		System.out.println("This is m1 method.");
	}
	
	public void m2(){
		System.out.println("This is m2 method.");
	}
}

class Test2 implements I {
	public void m1(){
		System.out.println("This is m1 method.");
	}
	
	public void m2(){
		System.out.println("This is m2 method.");
	}

	public void m3(){
		System.out.println("I am trying to override the default method.");
	}
}


class Test3 implements I {
	public void m1(){
		System.out.println("This is m1 method.");
	}
	
	public void m2(){
		System.out.println("This is m2 method.");
	}
}

class TestDefault{
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.m3();
	}
}