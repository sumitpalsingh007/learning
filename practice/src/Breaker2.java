public class Breaker2 {
 static String o = "";
 public static void main(String[]... args) {
 z:
 for(int x = 2; x < 7; x++) {
 if(x==3) continue;
 if(x==5) break z;
 o = o + x;
 }
 System.out.println(o);
 }
 
 public static void main(String[] args) {
	  String str = "null";
	 if (str == null){
	  System.out.println("null");
	  } else if(str.length()== 0) {
	  System.out.println("zero");
	 
	  } else {
	  System.out.println("some");
	  }
	  }
 }
