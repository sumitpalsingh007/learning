public class LineUp {
	public static void main(String[] args) {
		double d = 12.345;
		//System.out.printf("|%7.3f| \n", d);
		//System.out.printf("|%7d| \n", d);
		System.out.printf("|%7f| \n", d);
		//System.out.printf("|%3.7d| \n", d);
		System.out.printf("|%3.7f| \n", d);
		//System.out.printf("|%7.3d| \n", d);
		System.out.printf("|%7.3f| ", d);
		try{
		// some code here
		 try {
		 // some code here
			 throw new Exception();
		 } catch (Exception se) {
		 // some code here
			 throw new Exception();
			 
		 } finally {
		 // some code here
			 System.out.println("hi sumit");
		 }
		}catch(Exception e){
			
		}
	}
}