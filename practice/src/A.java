import java.text.DateFormat;

 public class A {
 
 
 public double doit(int x) {
	 return 1.0;
	 }
 
  public enum Title {
	  MR("Mr."), MRS("Mrs."), MS("Ms.");
	  private final String title;
	  private Title(String t) { title = t; }
	  public String format(String last, String first) {
	  return title + " " + first + " " + last;
	  }
	  }
	  public static void main(String[] args) {
	  System.out.println(Title.MR.format("Doe", "John"));
	  
	//  DateFormat d = new DateFormat();
	  }
	 
 }
