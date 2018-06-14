class TestA{
	public void start() { System.out.println("TestA"); }
}
public class TestB1 extends TestA {
	public void start() { System.out.println("TestB"); }
	public static void main(String[] args) {
		((TestB1)new TestB1()).start();
		
		TestA t = new TestB1();
		t.start();
		
	}
}