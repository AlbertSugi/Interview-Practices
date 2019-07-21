import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class reverseLinkedListInGivenSize {

    private LinkedList<Integer> answer=new LinkedList<Integer>();
    private int indx = 0;


    public LinkedList<Integer> linkedList(LinkedList<Integer>a,int num ){


        if((indx+1)!= a.size()) {
            LinkedList<Integer> temp = new LinkedList<>();
            int rotation = a.size() - (indx+1);
            if(rotation>=num) {
                for (int i = indx; i < num + indx; i++) {
                    temp.addFirst(a.get(i));
                }

                indx = indx + num;
                for (int i = 0; i < num; i++) {
                    answer.add(temp.get(i));
                }
                System.out.println(temp);
            }
            else{
                for (int i = indx; i <= rotation + indx; i++) {
                    temp.addFirst(a.get(i));

                }
                System.out.println(temp);


                indx = indx + rotation;
                for (int i = 0; i <= rotation; i++) {
                    answer.add(temp.get(i));
                }
                return linkedList(a,num);
            }






            return linkedList(a,num);
        }

        return answer;
    }

    public static void main(String[]args){
        reverseLinkedListInGivenSize rev = new reverseLinkedListInGivenSize();
        LinkedList<Integer> an = new LinkedList<>();
        an.add(1);
        an.add(2);
        an.add(3);
        an.add(4);
        an.add(5);
        an.add(6);
        an.add(7);
        an.add(8);
        an.add(9);
        an.add(10);
        an.add(11);
        rev.linkedList(an,3);

        System.out.println(rev.linkedList(an,3));


    }

}
