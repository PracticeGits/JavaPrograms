package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "Hello World";

       str= str.toLowerCase();

       char[] c =str.toCharArray();

       Map<Character,Integer> map = new HashMap<Character,Integer>();

       for(char cc : c){
           if(map.containsKey(cc)){
               map.put(cc,map.get(cc)+1);
           }else{
               map.put(cc,1);
           }
       }
        Set<Character> set = map.keySet();

       for(char l : set){
           if(map.get(l)>1){
               System.out.println(l+"-->"+map.get(l));
           }
       }

    }
}
