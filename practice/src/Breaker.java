import java.awt.Label;

public class Breaker {
	static String o = "";
	/*public static void main(String[] args) {
		//Label	z = new Label();
		
			o = o + 2;
			z:		
	for(int x = 3; x < 8; x++) {
		if(x==4) break;
		if(x==6) break z;
		o = o + x;
	}
	System.out.println(o);
	}*/
	
	public static void main(String[] args) {
		 try {
		 args = null;
		 args[0] = "test";
		 System.out.println(args[0]);
		 } catch (Exception ex) {
		 System.out.println("Exception");
		 } catch (NullPointerException npe) {
		 System.out.println("NullPointerException");
		 }
		 }
	}