import java.util.ArrayList;

public class SomeClass {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>(); // we will iterate this
        aList.add("1");
        aList.add("2");
        

        // this will cause ConcurrentModificationException. 
        // Since we are iterating the list, at the same time modifying it.
        /*for(String a: aList){
           aList.add("Sumit");
        }*/

        // old fashion for-loop will help
        int limit = aList.size();
        for(int i=0; i<limit; ++i){
           String a = aList.get(i);
           aList.add("sumit");
        }


    }
}