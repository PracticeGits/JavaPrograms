package ArrayProgramsAndILogical;

public class ReverseArray {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        char[] c={'a','b','c','d'};

        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]+" ");
        }

    }
}
