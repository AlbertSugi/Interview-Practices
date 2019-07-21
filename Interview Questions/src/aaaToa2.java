public class aaaToa2 {


    public String converter(String a){
        String[] s = a.split("");
        String curr = "";
        int num = 0;
        String ans = "";
        for(String x : s){
            if(!x.equals(curr)){
                if(num!=0) {
                    ans = ans + curr + num;
                }
                curr= x;
                num =1;

            }else {
                num++;
            }
        }
        ans = ans + curr + num;
        return ans;
    }


    public static void main(String[]args){
        aaaToa2 a = new aaaToa2();
        System.out.println(a.converter("aaabbccccccdd"));

    }
}
