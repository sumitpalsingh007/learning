import java.util.HashMap;
import java.util.Map;

public class FirstNoRepeatingCharacter {

    public String find(char[] chars){

        final Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i=0; i< chars.length; i++){
            if(map.containsKey(String.valueOf(chars[i]))){
                map.put(String.valueOf(chars[i]),map.get(String.valueOf(chars[i]))+1);
            } else {
                map.put(String.valueOf(chars[i]),1);
            }
        }
        for (int i=0; i< chars.length; i++){
            if(map.get(String.valueOf(chars[i])).equals(1)){
                return String.valueOf(chars[i]);
            }
        }
        return "";
    }

    public static void main(String[] args){
        FirstNoRepeatingCharacter o = new FirstNoRepeatingCharacter();
        char[] input = new char[10];
        input[0] = 'J';
        input[1] = 'a';
        input[2] = 'v';
        input[3] = 'a';
        //input[4] = 'J';
        String o1 = "dcba";
        System.out.println(o.find(o1.toCharArray()));
    }
}
