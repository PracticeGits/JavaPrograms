package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {
        String str = "RahulShettyAcademy";

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.toLowerCase().charAt(i));
        }
    }

}
