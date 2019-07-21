import java.util.Arrays;

public class temp {
    public int perarray(int[]a){

        if(a.length==0){
            return 1;
        }
        int count = 1;
        Arrays.sort(a);
        for(int i :a){
            if(i>0){
                if(i!=count){
                    return count;
                }
                count++;
            }
        }

        return count+1;
    }

    public static void main(String[]args){
        int[] check = {1, 1, 0, -1, -2};
        temp temp = new temp();

        System.out.println(temp.perarray(check));
    }

}


