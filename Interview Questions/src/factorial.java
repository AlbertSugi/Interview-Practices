public class factorial {

    public int generateFactorial(int n){
        if(n ==0){
            return 1;
        }

        return(n*generateFactorial(n-1));

    }

    public static void main (String[]args){
        factorial f = new factorial();
        System.out.println(f.generateFactorial(10));
    }
}
