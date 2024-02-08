package jaishlearnings;

public class GFG {
	
	String Employee_name = "Robo";
	float Employee_salary = 0;

	void set(String n, float p) {
		Employee_name = n;
		Employee_salary = p;
	}

	void get() {
		System.out.println("Employee name is: " +Employee_name ); 
		System.out.println("Employee CTC is: " + Employee_salary); 
	}

	static void display(){
		System.out.println("This is static method");
	}

	public static void main(String args[]) {
		GFG gfg = new GFG();
		gfg.set("Rathod Avinash", 10000.0f);
		gfg.get();
		GFG.display();
//		GFG.set("jaish", 20202);
//		GFG.get();
	} 
} 
