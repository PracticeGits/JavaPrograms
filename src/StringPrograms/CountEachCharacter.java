package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacter {


    public static void main(String[] args) {

        String str = "Hello World";

       char[] c= str.toCharArray();
       Map<Character,Integer> map = new HashMap<Character,Integer>();
       for(char cc:c){
           if(map.containsKey(cc)){
               map.put(cc,map.get(cc)+1);
           }else map.put(cc,1);
       }
        System.out.println(map);
    }
}
