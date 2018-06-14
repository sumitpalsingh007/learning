 class Payload {
 private int weight;
 public Payload (int w) { weight = w; }
 public void setWeight(int w) { weight = w; }
 public String toString() { return Integer.toString(weight); }
 }
 public class TestPayload {
 static void changePayload(Payload p) { /* insert code */p.setWeight(420); }
 public static void main(String[] args) {
 Payload p = new Payload(200); 
 p.setWeight(1024);
 changePayload(p);
 System.out.println("p is " + p);
 } }