interface A1 { public void aMethod(); }
interface B1 { public void bMethod(); }
interface C extends A1,B1 { public void cMethod(); }
class D implements B1 {
	public void bMethod(){System.out.println("1");}
}
public class E extends D implements C {
	public void aMethod(){System.out.println("2");}
	public void bMethod(){System.out.println("3");}
	public void cMethod(){System.out.println("4");}
	
	public static void main(String args[]){
		D e = (D)(new E());
		 e.bMethod();
	}
}