package StringPrograms;

public class input1 {


    public static void main(String[] args) {
        //output = aabbbcccc
        String str = "a2b3c4d5";
        StringBuilder build = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                build.append(c);
            }
            else if(Character.isDigit(c)){
               int repeatedValue= Character.getNumericValue(c);
               for(int j=1;j<repeatedValue;j++){
                   build.append(str.charAt(i-1));
               }
            }
        }
        System.out.println(build.toString());


    }






}
