import java.util.ArrayList;
import java.util.List;

public class findKMissingNaturalNumbers {

    public List<Integer> KMissingNumbers(int[]a,int k){

        List<Integer> answer = new ArrayList<>();


        if(a.length==0){
            for(int i = 1;i<=k;i++){
                answer.add(i);
            }
            return answer;
        }
        int index =0;
        int curriter = 1;
        while(index<k){
            for(int i : a){
                if(i>0){
                    if(curriter!=i){
                        index++;
                        answer.add(curriter);
                    }
                    curriter++;
                }
            }
        }

        return answer;
    }


    public static void main (String[]args){
        findKMissingNaturalNumbers k = new findKMissingNaturalNumbers();
        int[] arr = {1,2,3};
       System.out.println( k.KMissingNumbers(arr,1000));

    }
}
