class Super {
 public int a;
 protected Super(int a) { this.a = a; }
 }

 class Sub extends Super {
 public Sub(int a) { super(a); a=7;}
 public Sub() {super(7); a = 5; }
// a=6;
 }