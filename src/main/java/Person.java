import java.util.Collections;
import java.util.HashSet;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		if ( ! ( o instanceof Person) ) return false;
		Person p = (Person) o;
		return p.name.equals(this.name);
	}
	
	@Override
	public int hashCode(){
		//return 1;
		return name.hashCode();
	}
	
	public static void main(String[] args){
		HashSet set = new HashSet();
		Person sumit = new Person("Sumit");
		Person pal = new Person("Sumit");
		System.out.println(sumit.equals(pal));
		System.out.println(sumit.hashCode() +"  "+pal.hashCode());
		set.add(sumit);
		set.add(pal);
		System.out.println(set.size());
		System.out.println(set.contains(sumit)+"  "+set.contains(pal));
	}
}
