package Algorithm;

import java.util.Arrays;

public class longestIncreasingSubsequence {

    public int findIncSub(int [] a){

        int [] longsub = new int[a.length];
        Arrays.fill(longsub,1);

        for(int i = 0;i<a.length;i++){
            for(int j = 1; j<a.length;j++){
                if(a[i]<a[j]&&longsub[i]>=longsub[j]){
                    longsub[j]=longsub[i]+1;
                }

            }
        }
      /*  for(int i: longsub){
            System.out.print(i);
        }
*/
        Arrays.sort(longsub);

        return longsub[a.length-1];

    }

    public static void main (String[]args){
        longestIncreasingSubsequence a = new longestIncreasingSubsequence();
        int[]x = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println(a.findIncSub(x));

    }





}
