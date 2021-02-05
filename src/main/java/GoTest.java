
public class GoTest {
	
	public static void main(String...args){
		
	  Sente a = new Sente(); a.go();
	  Goban b = new Goban(); b.go();
	  Stone c = new Stone(); c.go();
	  
	}	
}

class Sente implements Go{
	public void go(){
		System.out.println("go in Sente");
	}
}

class Goban extends Sente{
	public void go(){
		System.out.println("go in Goban");
	}
}

class Stone extends Goban implements Go{}

interface Go{
	public void go();
}

interface A111 {
 String s = "yo";
 
 public void method1();
 }
 interface B { }
 interface C extends A111, B {
 public void method1();
 public void method1(int x);}