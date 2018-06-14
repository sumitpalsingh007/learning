public class Hello1 {
	String title;
	int value;
	public Hello1() {
		System.out.println("default");
		title += " World";
	}
	public Hello1(int value) {
		//this();
		this(1,2);
		this.value = value;
		title = "Hello";

	}
	
	public Hello1(int value, int value1) {
		this();
		this.value = value;
		System.out.println("default");
		title = "Hello1";

	}
	
	public void foo() {}
	
	public static void main(String args[]){
		Hello1 c = new Hello1(5);
		System.out.println(c.title);
		int []x[] = {{1,2}, {3,4,5}, {6,7,8,9}};
		
	}
	
}



