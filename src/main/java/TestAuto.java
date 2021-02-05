import java.util.HashMap;
import java.util.Map;


public class TestAuto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ferrari f = (Ferrari)new Car();
		Ferrari c = new Ferrari();
Map m = new HashMap();
m.put(c, "Sumit");
m.put(c, "Sumit1");
m.put(c, "Sumit2");
System.out.println(m);
	}

}
