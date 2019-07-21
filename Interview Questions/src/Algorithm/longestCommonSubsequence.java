package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class longestCommonSubsequence {


    public int LongestCommon (String w,String q){
         w = " "+w;
         q=" "+q;
        String[]a = w.split("");
        String []b = q.split("");

        int aoccur = 0;
        int boccur = 0;

        int curr = 0;

        List<String> answer = new ArrayList<>();



        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i].equals(b[j])&& i>aoccur&& j>boccur){
                    aoccur = i;
                    boccur = j;
                    System.out.print(i);
                    System.out.println(j);
                    answer.add(a[i]);
                    curr++;
                    a[i] ="?";
                    b[j] = "?";
                }

            }

        }
        System.out.println(answer);
        return curr;


    }
    public static void main (String[] args){
        longestCommonSubsequence a = new longestCommonSubsequence();
        System.out.println(a.LongestCommon("ABCDGH","AEDFHR"));

    }
}
