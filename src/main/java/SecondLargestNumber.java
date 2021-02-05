import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args){
        int[] i = new int[3];
        i[0]=5;
        i[1]=3;
        i[2]=10;
        System.out.println(SecondLargestNumber.find(i));
    }

    public static Integer find(int[] arr){
        int largest=0; int diff=0;
        for (int i =0; i < arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];

            } /*else if ((diff > (largest - arr[i]))) {
                diff = largest - arr[i];
            }*/
        }
        diff = largest -arr[0];
        for (int i =0; i < arr.length;i++){
            if(diff > (largest - arr[i])) {
                diff = largest -arr[i];
            }
        }
        return largest - (diff);
    }
}
