import java.util.Arrays;

public class largestSubarrayWithContiguousElements {


    public int checkContigousLength(int[] a){
        Arrays.sort(a);

        int index = a[0];
        int ans = 0;
        int temp = 0;

        for(int i :a){
            if( i ==index){
                temp++;
                index++;
            }
            else{if(temp>ans){
               ans = temp;
            }
            temp = 0;
            index = i;}

        }
        return ans;

    }

    public static void main(String[]args){

        largestSubarrayWithContiguousElements ta = new largestSubarrayWithContiguousElements();
        int []a = {2,3,4,10,1,8,7};
        System.out.println(ta.checkContigousLength(a));
    }
}
