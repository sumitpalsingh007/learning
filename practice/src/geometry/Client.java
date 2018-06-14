package geometry;

  class A {

	String name="a";
	String getName(){
		return name;
	}
	String greetings(){
		return "class A";
	}
}
  class B extends A {

	String name="b";
	String getName(){
		return name;
	}
	String greetings(){
		return "class B";
	}
}

public class Client{
	public static void main(String[] args){
		A a = new A();
		A b = new B();
		System.out.println(a.getName()+" "+a.greetings());
		System.out.println(b.getName()+" "+b.greetings());
	}
}
