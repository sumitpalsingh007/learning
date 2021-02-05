import java.util.ArrayList;


public class Animal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Dog extends Animal{
	public void go(){
		ArrayList<Dog> aList = new ArrayList<Dog>();
		takeList(aList);
	}
	
  public void takeList(ArrayList<? extends Object> list)	{
	  
  }
}