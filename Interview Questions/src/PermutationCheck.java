import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*A non-empty array A consisting of N integers is given.

        A permutation is a sequence containing each element from 1 to N once, and only once.

        For example, array A such that:

        A[0] = 4
        A[1] = 1
        A[2] = 3
        A[3] = 2
        is a permutation, but array A such that:

        A[0] = 4
        A[1] = 1
        A[2] = 3
        is not a permutation, because value 2 is missing.

        The goal is to check whether array A is a permutation.

        Write a function:

class findMissingIntegerInaSequence { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

        For example, given array A such that:

        A[0] = 4
        A[1] = 1
        A[2] = 3
        A[3] = 2
        the function should return 1.

        Given array A such that:

        A[0] = 4
        A[1] = 1
        A[2] = 3
        the function should return 0.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [1..1,000,000,000].*/

public class PermutationCheck {
    public int solution(int[] A) {
        if(A.length ==1){
            if(A[0]==1){
                return 1;
            }
            return 0;
        }

        List<Integer> unique = new ArrayList<>();
        Arrays.sort(A);
        if(A[A.length-1]!= A.length){
            return 0;
        }
        int curr = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]!= curr){
                unique.add(A[i]);
                curr = A[i];
            }
        }
        int curr2 = 0;
        for(int i = 0;i<unique.size();i++){
            if((unique.get(i)-curr2)!= 1){
                return 0;
            }
            curr2 = unique.get(i);
        }

        return 1;

    }
    public static void main (String[]args){
        PermutationCheck permutationCheck = new PermutationCheck();
        int[] a = new int []{4,1,3,2,4,5};
        permutationCheck.solution(a);
    }
}
