package StringPrograms;

public class CountCharacters{

    public static  void main(String[] args) {

        //login and merge nad dance
        String s ="Welcome Home buddy";
        int count = 0;
        for(int i=0;i<=s.length()-1;i++){
            char c =  s.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
