public class TestOne implements Runnable {
	public static void main (String[] args) throws Exception {
		Thread t = new Thread(new TestOne());
		t.start();//only creating a new thread is guaranteed; when it would run is not guaranteed
		
		System.out.print("Started");
		//t.join(123456789);
		t.join();// it will cause the current thread to wait until t finishes its operation
		System.out.print("Complete");
	}
	public void run() {
		//System.out.println("Bingo");
		for (int i = 0; i < 4; i++) {
			System.out.print(i);
		}
	}
}