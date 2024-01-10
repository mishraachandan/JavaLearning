package java1_8_newfeaturesbydurga;

class InnerClass{
	public static void main(String[] args) {
//		Runnable runnable = new Runnable()
//		{
//			@Override
//			public void run(){
//				System.out.println("I am declaring a inner class over here with the help of a Interface Runnable");
//			}
//		};

		Runnable r = () -> System.out.println("This is the method now.");

		Thread t = new Thread(r);

		t.start();
	}
}