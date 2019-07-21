package Algorithm;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Solution solution = new Solution();
        int [] a = {3,2,2,3,3,4,6,7};

        System.out.println(solution.arraySub(a,3));




        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }

    public int arraySub(int[]a,int rem){

        int ans = a.length;

        for(int i = 0;i<a.length;i++){
            if(a[i]==rem){
                for(int j = i;j<a.length;j++){
                    if(a[j]!=rem){
                        ans--;
                        a[i]=a[j];
                        a[j]=rem;
                        break;
                    }
                }





            }

        }

        for(int i : a){

            System.out.print(i);
        }
        System.out.println();






        return ans;



    }
}