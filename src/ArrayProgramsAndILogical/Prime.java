package ArrayProgramsAndILogical;

import java.util.Scanner;

public class Prime {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num =sc.nextInt();

        if(num<=1) {
            System.out.println(" hiNot Prime Number");
        return;
        }
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0) {
                isPrime=false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime Number");
        else System.out.println("Not Prime Number");

    }
}
