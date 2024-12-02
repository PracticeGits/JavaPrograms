package ArrayProgramsAndILogical;

public class CapitalLetterCount {

    public static void main(String[] args) {

        String str ="Hello Hi Bye Good";
        int count=0;

        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }
        }

        System.out.println(count);
    }
}
