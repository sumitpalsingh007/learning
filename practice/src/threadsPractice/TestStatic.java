package threadsPractice;

public class TestStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TestStatic t = new TestStatic();
 t=null;
 t.test1();
	}
	
	static void test(){
		System.out.println("hi");
	}

	void test1(){
		System.out.println("hi1");
	}
}
