package StringPrograms;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonrepeatingCharacter {

    public static void main(String[] args) {

        String str ="GeeksforGeeks";

        Map<Character,Integer> map = new TreeMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else map.put(c,1);
        }

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.get(c)==1){
                System.out.print(c);
                break;
            }
        }






    }
}
