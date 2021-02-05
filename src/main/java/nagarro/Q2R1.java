package nagarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q2R1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer[]> result= new Q2R1().test(new Integer[] {6,2,3,10,5,9,12}, 21);
		for(Integer[] i:result)
			System.out.println(Arrays.asList(i));
		System.out.println("================");
		/*List<Integer[]> result1= new Q2R1().test(new Integer[] {1,2,3,4,5,6,7}, 12);
		for(Integer[] i:result1)
			System.out.println(Arrays.asList(i));*/
	}
	List<Integer[]> test(Integer[] input, int sum){
		List<Integer[]> finalList = new ArrayList<Integer[]>();
		List<Integer> inputList = Arrays.asList(input);
		for(int i=0;i<inputList.size();i++){
			List<Integer> copyList = new ArrayList( inputList);
			List<Integer> tempList = new ArrayList();
			tempList.add(inputList.get(i));
			copyList.set(i,0);
			while(sumIt(tempList)<sum){
			if(copyList.contains(sum-sumIt(tempList))){
				List<Integer> list = new ArrayList();
				list.addAll(tempList);
				list.add(sum-sumIt(tempList));
				Integer[] array=list.toArray(new Integer[list.size()]);
				//Arrays.sort(array);
				finalList.add(array);
				break;
			}else{
				tempList.add(inputList.get(inputList.indexOf(tempList.get(tempList.size()-1))+1));
			}
			}
		}
		/*Map <Integer,Integer>inputMap = new HashMap();
		//List tempList = new ArrayList();
		for(int i=0;i<input.length;i++ ){
			inputMap.put(i, input[i]);
		}
		System.out.println(inputMap);
		List tempList = new ArrayList();
		Map copyMap = new HashMap(inputMap);
		for(Entry<Integer,Integer> inp:inputMap.entrySet()){
			List<Integer> tempInt = new ArrayList();
			tempInt.add(inp.getKey());
			copyMap.remove(inp.getKey());
			if(copyMap.containsValue(sum-inp.getValue() sumIt(tempInt))){
				copyMap.values().remove(sum- sumIt(tempInt));
				//Integer[] array=new Integer[] {inp.getValue(),sum-inp.getValue()};
				tempInt.add(sum-sumIt(tempInt));
				boolean add=false;
				finalList.add((Integer[]) tempInt.toArray(new Integer[tempInt.size()]));
			}
			else{
				tempInt.add(sum-sumIt(tempInt));
			}
		}*/

		return finalList;
	}
	public Integer sumIt(List<Integer> list) {
	     Integer sum= 0; 
	     for (Integer i:list)
	         sum = sum + i;
	     return sum;
	}

}
