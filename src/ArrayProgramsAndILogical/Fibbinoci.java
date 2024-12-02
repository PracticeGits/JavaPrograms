package ArrayProgramsAndILogical;

import java.util.Scanner;

public class Fibbinoci {

    public static void main(String[] args) {

        int fibLength;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers: ");
        fibLength=sc.nextInt();

        int a[]=new int[fibLength];
        a[0]=0;
        a[1]=1;

        for (int i=2;i<fibLength;i++){
            a[i]=a[i-1]+a[i-2];
        }

        for (int i=0;i<fibLength;i++){
            System.out.println(a[i]);
        }




    }

}
