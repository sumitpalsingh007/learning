interface Foo1{
	int bar();
}
public class Beta {
 
	class A implements Foo1{
		public int bar(){
			return 1;
		}
	}
	
	public int fubar(Foo1 foo){
		return foo.bar();
	}
	
	public void testFoo(){
		
		class A implements Foo1{
			public int bar(){
				return 2;
			}
		}
		
		System.out.println(fubar(new A()));
	}
	
	public static void main(String[] argv){
		new Beta().testFoo();
	}
}
