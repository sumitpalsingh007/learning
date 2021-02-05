package exceptions;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	 throw new MyExcpetion();
 }
 catch(Exception e){
	 e.printStackTrace();
 } catch (MyExcpetion e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
