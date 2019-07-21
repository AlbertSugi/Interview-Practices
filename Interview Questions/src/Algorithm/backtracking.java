package Algorithm;

import java.util.*;

public class backtracking {

    private HashSet<String> dictionary = new HashSet<>();

    private void dict(String[] dic){
        Collections.addAll(dictionary,dic);
        }

        public boolean solveWord(String word) {

            HashSet<String> memory = new HashSet<>();
            String answer = "";

            return(findUsingDP(word, dictionary, memory,answer));
        }





    public boolean findUsingDP(String s, HashSet<String> dict,
                               HashSet<String> memory, String answer) {
        if (s.length() == 0) {
            System.out.println(answer);
            return true;
        } else if (memory.contains(s)) {
            return false;
        } else {

            int index = 0;
            String word = "";
            while (index < s.length()) {
                word += s.charAt(index);// add one char at a time
                // check if word already being solved
                if (dict.contains(word)) {
                    if (findUsingDP(s.substring(index + 1), dict, memory, //if this returns true,continue,else backtrack
                            answer + word + " ")) {
                        return true;
                    } else {
                        System.out.println("backtrack");
                        index++;
                    }
                } else {
                    index++;
                }
            }
            memory.add(s);// memoization for future;
            return false;
        }
    }





    public static void main(String[]args){
        String[]tempdic = {"mobile","samsung","sam","sung",
                "man","mango", "icecream","and",
                "go","i","love","ice","cream"};
        backtracking backtracking = new backtracking();
        backtracking.dict(tempdic);
        backtracking.solveWord("iloveicecreamandmango");



    }


}
