import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {


    public int[] rotLeft(int[] a, int d) {



        for(int i = 0;i<d;i++){
            int first = a[0];
            for(int t = 0;t<a.length-1;t++){
                a[t]=a[t+1];
            }
            a[a.length-1] = first;
            a.clone();

        }



    return a;


    }

    public static void main(String[]args){
        ArrayRotation arrayRotation = new ArrayRotation();
        int[]a = new int []{1,2,3,4,5};

        int[]b = arrayRotation.rotLeft(a,2);
        for(int x: b){
            System.out.print(x);
        }

    }

}
