class A12 {
	void foo() throws Exception { throw new Exception(); }
}
class SubB2 extends A12 {
	void foo() { 
		System.out.println("B "); }
}
public class Tester1 {
	public static void main(String[] args) {

		SubB2 a = new SubB2();
		a.foo();


	}
}