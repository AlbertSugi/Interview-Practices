import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class printUniqueRowsFromMatrix {


    public void rowIdentifier(int[][]matrix){
        Set<String> unique = new HashSet<>();
        for (int[] m:matrix){
            unique.add(Arrays.toString(m));
        }
        System.out.print(unique);

    }

    public static void main(String[]arga){
        int [][] question = {{0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0}};

        printUniqueRowsFromMatrix t = new printUniqueRowsFromMatrix();
        t.rowIdentifier(question);

    }

}
