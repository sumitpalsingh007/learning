
public class AAA {

	public String doIt(int... x){

		 
		 
		// static final int[] a2 = new int[2]{ 100,200 };
		// static final int[] a3; static void init() { a3 = new int[3]; a3[0]=100; a3[1]=200; }
		return "b";
	}
	
	public String doIt(int x, int y){
		return "a";
	}
	static final int[] a = { 100,200 };
	static final int[] a1;  static{a1=new int[2]; a1[0]=100; a1[1]=200; }
	public static void main(String[] args){
		AAA a = new AAA();
		System.out.println(a.doIt(4,5));;
		
	}
}
