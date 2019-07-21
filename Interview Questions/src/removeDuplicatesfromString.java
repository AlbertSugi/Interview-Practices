import java.util.HashSet;

public class removeDuplicatesfromString {

    public String removeDuplicates(String s){
        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            hashSet.add(String.valueOf(s.charAt(i)));
        }



        return hashSet.toString().replace(", ","").replace("[","").replace("]","");


    }

    public static void main (String[]args){

        removeDuplicatesfromString r = new removeDuplicatesfromString();
        System.out.println(r.removeDuplicates("dddododwe"));
    }
}
