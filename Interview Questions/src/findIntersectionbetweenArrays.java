import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findIntersectionbetweenArrays {

    private Set<Integer> answer = new HashSet<>();
    private int[] arrA;
    private int[] arrB;


    public Set<Integer> intersection(int[] a, int[] b) {
        arrA = a;
        arrB = b;
        answer = new HashSet<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int indexA = 0;
        int indexB = 0;

        int currA = arrA[0];
        int currB = arrB[0];
        comparison(indexA, indexB, currA, currB);

        return answer;


    }

    private void comparison(int indA, int indB, int currA, int currB) {
        try {
            if (currB > currA) {
                if (indA < arrA.length - 1) {
                    indA++;
                    currA = arrA[indA];
                    comparison(indA, indB, currA, currB);
                } else {
                    indB++;
                    currB = arrB[indB];
                    comparison(indA, indB, currA, currB);
                }

            } else if (currB < currA) {
                if (indB < arrB.length - 1) {
                    indB++;
                    currB = arrB[indB];
                    comparison(indA, indB, currA, currB);
                } else {
                    indA++;
                    currA = arrA[indA];
                    comparison(indA, indB, currA, currB);
                }
            } else  {
                answer.add(currA);
                if (indA < arrA.length - 1) {
                    indA++;
                    currA = arrA[indA];
                    comparison(indA, indB, currA, currB);
                } else if (indB < arrB.length - 1) {
                    indB++;
                    currB = arrB[indB];
                    comparison(indA, indB, currA, currB);
                }
            }

        } catch (Exception e) {
            System.out.println("done");
        }

    }


    public static void main(String[] args) {
        findIntersectionbetweenArrays fn = new findIntersectionbetweenArrays();
        int[]a = new int []{1,4,6,22,9,9,10};
        int[]b = new int []{2,5,6,22,11,100};

        System.out.println(fn.intersection(a,b));

    }
}
