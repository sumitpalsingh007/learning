import java.util.*;
public class TestSet {

	enum Example{ONE, TWO, THREE}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Collection coll = new ArrayList();
       coll.add(Example.THREE);
       coll.add(Example.THREE);
       coll.add(Example.THREE);
       coll.add(Example.TWO);
       coll.add(Example.TWO);
       coll.add(Example.ONE);
       Set set = new HashSet(coll);
       Iterator i = set.iterator();
       for(Object s:set){
    	   System.out.println(s);
       }
	}

}
