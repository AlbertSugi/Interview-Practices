import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class happyNumber {

    private  Set<Integer> calcContainer = new HashSet<>();
    private boolean status = true;


    public boolean isHappyorUnhappy(int num){
        calcContainer.clear();
        status = true;
        return isHappynumber(num);

    }


    private boolean isHappynumber(int number){
            String[] stringNum = String.valueOf(number).split("");


            if (number != 1 & status){
                int curr = 0;
                for (String num: stringNum){
                    int intNum = Integer.parseInt(num);
                    curr = curr + (intNum*intNum);

                }
                status = calcContainer.add(curr);
                isHappynumber(curr);
            }
           calcContainer.clear();

           return status;

        }


        public static void main(String[]args){
        happyNumber happyNumber = new happyNumber();

        System.out.println(happyNumber.isHappyorUnhappy(4));
        System.out.println(happyNumber.isHappyorUnhappy(7));
        }



}
