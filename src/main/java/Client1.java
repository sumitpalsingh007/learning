
public class Client1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11 a = new A11();
		A11 b = new B11();
		System.out.println(a.greeting()+" has name "+a.getName());
		System.out.println(b.greeting()+" has name "+b.getName());
	}

}
class A11{
	String name= "A";
	String getName(){
		return name;
	}
	String greeting(){
		return "class A";
	}
}

class B11 extends A11{
	String name ="B";
	String greeting(){
		return "class B";
	}
}