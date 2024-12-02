package ArrayProgramsAndILogical;

public class ShiftAllZerosToRight {
    public static void main(String[] args) {


        int a[] = {1, 0, 3, 0, 0, 5, 0, 2, 8, 7, 0, 4, 0};
        int index=0;
        for (int i =0; i<a.length;i++){
            if(a[i]!=0) {//for left shift just a[i]==0
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                index++;
            }
        }
        for (int i =0; i<a.length;i++){
            System.out.print(a[i]);
        }


    }
}
