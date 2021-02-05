
public class runtimeComplietimePolymorphism {

	public static void main(String[] args){
		Foo f = new Bar();
		Foo f3 = new Foo();
		Bar b2 = new Bar();
		Bar b =(Bar)f;
		//Bar bb = (Bar)f3;
		Foo bb2 = (Foo)b2;
		f.addFive();
		f3.addFive();
		b.addFive();
		//bb.addFive();
		bb2.addFive();
		//System.out.println(f.a);
		
		//System.out.println(b.a);
		
		Foo f1 = (Foo)f;
		Foo f2 = new Foo();
		
		//f.addFive();
		//System.out.println(f.a+f.getClass().toString());
        //b.addFive();
		//System.out.println(b.a+b.getClass().toString());
		//f1.addFive();
		//System.out.println(f1.a+f1.getClass().toString());
		//f2.addFive();
		//System.out.println(f2.a+f2.getClass().toString());
	}
}

class Foo {
	public int a = 3;
	public void addFive() { this.a += 5; System.out.print("f "); }
}
class Bar extends Foo {
	public int a = 8;
	public void addFive() { this.a += 5; System.out.print("b " ); }
}