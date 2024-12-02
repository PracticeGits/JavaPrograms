package ArrayProgramsAndILogical;

import java.util.HashMap;
import java.util.Map;

public class MaximumConsecutiveOne {

    public static void main(String[] args) {

        int[] array = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }else map.put(array[i],1);
        }

        int maxKey=-1;
        int maxvalue=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxvalue){
                maxvalue=entry.getValue();
                maxKey=entry.getKey();
            }
        }
        System.out.println(maxKey);
        System.out.println(maxvalue);




    }
}
