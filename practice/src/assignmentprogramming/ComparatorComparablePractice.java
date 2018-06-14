package assignmentprogramming;

import java.util.Comparator;

public class ComparatorComparablePractice implements Comparator<String>{

	String[] temp ;
	
	public void setValues(){
		temp = new String[10];
		temp[0]="sumit";
		temp[1]="pal";
		temp[2]="singh";
		temp[3]="surjeet";
		temp[4]="singh";
		temp[5]="sandal";
		temp[6]="ramgariya";
		temp[7]="king";
		temp[8]="golu";
		temp[9]="rajesh";
		
		//System.out.println(temp.length);
	}
		
	public static void main(String[] args) {
		ComparatorComparablePractice c = new ComparatorComparablePractice();
		 
		c.setValues();
		c.printList();
		c.sort();
		c.printList();
	}

	@Override
	public int compare(String arg0, String arg1) {
		 
		return String.CASE_INSENSITIVE_ORDER.compare(arg0, arg1);
		
		};
		
	public void sort(){
		for (int i=0;i<temp.length;i++){
			for(int j=i+1;j<temp.length;j++){
				if(compare(temp[i],temp[j])>0){
					String swapper = temp[i];
					temp[i]=temp[j];
					temp[j]=swapper;
				}
			}
			
		}
		 
	}
	public void printList(){
		for (String i:temp){
			System.out.println(i);
		}
	}

	@Override
	public void  finalize(){
		 System.out.println("hi sumit i am inside finalize");
	 }
	
	
}
