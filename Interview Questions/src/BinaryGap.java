
/*

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

        Write a function:

class findMissingIntegerInaSequence { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].

*/




public class BinaryGap {
    public int solution(int N) {
        String binarygap = Integer.toBinaryString(N);
        System.out.println(binarygap);
        String[] seperate = binarygap.split("");
        int ones = 0;
        for (String i : seperate) {
            if (i.equals( "1")) {
                ones++;
            }
        }
        System.out.println(ones);

        int answer = 0;

        if (ones < 2) {
            answer = 0;
        } else {
            if(!seperate[seperate.length-1].equals("1")){
            String[] seperatezero = binarygap.split("1");


            for (int i = 0; i < seperatezero.length-1; i++) {
                int len = seperatezero[i].length();
                if (len > answer) {
                    answer = len;
                }
            }
            }
            else{
                String[] seperatezero = binarygap.split("1");


                for (int i = 0; i < seperatezero.length; i++) {
                    int len = seperatezero[i].length();
                    if (len > answer) {
                        answer = len;
                    }
                }

            }
            // write your code in Java SE 8
        }
        return answer;

    }

    public static void main (String[]args){
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(51712));
    }
}
