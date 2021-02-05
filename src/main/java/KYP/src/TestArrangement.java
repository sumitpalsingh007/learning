import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

import dto.KYP;


public class TestArrangement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

		KYP k1 = new KYP("1","1","1","1");
		KYP k2 = new KYP("2","2","2","2");
		KYP k3 = new KYP("3","3","3","3");
		KYP k4 = new KYP("1","4","4","4");
		
		List<KYP> list = new ArrayList<KYP>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		list.add(k4);
		Set<KYP> set= new HashSet<KYP>();
		set.addAll(list);
		
		final Map<String,KYP> mappedRoles = Maps.uniqueIndex(list, new Function<KYP,String>() {
			  public String apply(KYP from) {
			    return from.key; // or something else
			  }});
	
	System.out.println(mappedRoles);
	}
}
