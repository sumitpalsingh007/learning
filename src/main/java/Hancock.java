import java.util.*;
 public class Hancock {
	 public void addStrings(List<? super String> list) {
	//D. public void addStrings(List<? extends String> list) { 
	 list.add("foo");
 }
 }