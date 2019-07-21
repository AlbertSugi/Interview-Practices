import java.util.Arrays;
import java.util.HashMap;

/*Write a function:

class findMissingIntegerInaSequence { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].*/
public class findsmallestint {
    public int solution(int[] A) {
        Arrays.sort(A);
        HashMap<Integer,String> pos = new HashMap<>();

        int curr = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>0 & A[i]!=curr){
                pos.put(A[i],String.valueOf(A[i]));
                curr = A[i];
            }
        }

        if(pos.isEmpty()){
            return 1;
        }

        int answer = 1;
        for(int i=1;i<A[A.length-1];i++){
            if(!pos.containsKey(i)){
                answer = i;
                break;
            }
            else {
                answer++;
            }

        }

        if(answer == A[A.length-1]){
            answer++;
        }



        return answer;
    }
    public static void main (String []args){
        int [] a = new int []{1,2,3};
        findsmallestint findsmallestint = new findsmallestint();
        System.out.println(findsmallestint.solution(a));
    }
}
