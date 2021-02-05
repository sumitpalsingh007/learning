package passByValue;

public class PassByValue {

	static int i=1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pb1 p=new Pb1();
		Pb2 p2 = new Pb2();
		System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.a);
		p2.test(p);
		System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.a);

		System.out.println("i is"+i);
		p2.test2(i);
		System.out.println("i is"+i);
		
		
	}
	

}
