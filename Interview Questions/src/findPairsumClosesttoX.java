import java.util.ArrayList;
import java.util.List;

public class findPairsumClosesttoX {

    public String findPairclosest(int []a,int x){

        int diff = 999999999;
        int ans1 = 0;
        int ans2 = 0;

        int indl = 0;
        int indr = a.length -1;
        while(indl<indr) {
            if (Math.abs((a[indl] + a[indr]) - x) < diff) {
                ans1 = a[indl];
                ans2 = a[indr];
                diff = Math.abs((a[indl] + a[indr]) - x);
            }

            if ((a[indl] + a[indr]) < x) {
                indl++;
            }
            else {
                indr--;
            }
        }

        return ans1 +" and " +ans2;

    }

    public static void main (String[]args){
        findPairsumClosesttoX x = new findPairsumClosesttoX();
        int arr[] = {10, 22, 28, 29, 30, 40};
        System.out.println(x.findPairclosest(arr,54));

    }
}
