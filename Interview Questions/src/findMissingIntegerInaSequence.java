import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//array = [1, 3, 6, 4, 1, 2]  5
        //= [1, 2, 3]   4
        //= [-1,-3]   1
class findMissingIntegerInaSequence {
    private int solution(int[] A) {
        Arrays.sort(A);
        List<Integer> positive = new ArrayList<>();
        for(int i = 0 ; i<A.length;i++) {
            if (A[i] > 0) {
                positive.add(A[i]);
            }
        }

        List<Integer> newpos = positive.stream().distinct().collect(Collectors.toList());
        //System.out.println(newpos);

        int curr = 1;
        int safety = 0;
        int ans = 1 ;
        for(int i : newpos){
            if (i != curr){
                ans = curr;
                safety ++;
                break;
            }

            curr++;
        }
        if (safety == 0){
            return curr;
        }
        return ans;
        // write your code in Java SE 8

    }

    public static void main(String[]args){
        findMissingIntegerInaSequence sol = new findMissingIntegerInaSequence();
        int [] first = new int []{1, 3, 6, 4, 1, 2};
        int [] second = new int []{1, 2, 3};
        int [] third = new int []{-1,-3};

        System.out.println(sol.solution(first));
        System.out.println(sol.solution(second));
        System.out.println(sol.solution(third));
    }
}