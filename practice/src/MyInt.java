import java.util.*;
public class MyInt implements Comparable{
	
	private int i;

	public MyInt(int j) {
		// TODO Auto-generated constructor stub
		this.i=j;
	}

	public String toString(){
		return Integer.toString(i);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<MyInt> list = new ArrayList<MyInt>();
		list.add(new MyInt(2));

		list.add(new MyInt(1));
		Collections.sort(list);
		System.out.println(list);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyInt i2 = (MyInt)o;
		return i-i2.i;
	}

}
