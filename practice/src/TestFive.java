
public class TestFive {
	private int x;
	public synchronized void foo() {
		int current = x;
		x = current + 1;
		System.out.print(x + ", ");
	}
	public  void go() {
		for(int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					foo();

				} }.start();
		}
	}
	public static void main(String[] args){
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Cat");
			}
		};
		r.run();
		Thread t = new Thread(r) {
			public void run() {
				System.out.println("Dog");
			}
		};
		t.start();
		TestInterface t12 = new TestInterface(){
			public void test(){
				System.out.println("hi sumit");
			}
		};
		t12.test();
	} 


}
