package ArrayProgramsAndILogical;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
       int num= sc.nextInt();
        int originalNum=num;
       double result=0;

       //to know the digits
        //int digits=String.valueOf(num).length();
       while(originalNum!=0){
         int temp=  originalNum%10;
         //math.pow returns double so result is double
           //(int)Math.pow(temp,3)  we can typecast there also
         result=result+Math.pow(temp,3);//(temp,digits)
           originalNum=originalNum/10;

       }
       if(result==num) System.out.println("Armstrong Number");
       else System.out.println("Not Armstrong Number");


    }



}
