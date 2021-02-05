public abstract class AbstractTest {
public int getNum() {
return 45;
}
public abstract class Bar {
public int getNum() {
return 38;
}
}
public static void main(String[] args) {
	System.out.println("here");
	
	System.out.printf("Pi is approx %f and E is approx %b", Math.PI,Math.E);	
AbstractTest t = new AbstractTest() {
public int getNum() {
return 22;
}
};
AbstractTest.Bar f = t.new Bar() {
public int getNum() {
return 57;
}
};
System.out.println(f.getNum() + " " + t.getNum());
}
}