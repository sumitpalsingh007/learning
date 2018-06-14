public class Pass22 {
 public void main(String [] args) {
 int x = 6;
 Pass22 p = new Pass22();
 p.doStuff(x);
 System.out.print(" main x = " + x);
 }

 void doStuff(int x) {
 System.out.print(" doStuff x = " + x++);
 }
 }