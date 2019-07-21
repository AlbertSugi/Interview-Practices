package Algorithm;

public class editDistance {

    public int editDistance(String first,String second){

        int[][]editmat = new int [first.length()+1][second.length()+1];
        first = " "+first;
        second = " "+second;

        String[]a = first.split("");
        String[]b = second.split("");


        int afirstrow = 1;
        int bfirstcol=1;
        for(int i = 0;i<first.length();i++){
            for(int j=0;j<second.length();j++){
                if(i==0 &&j ==0){
                    editmat[i][j] =0;
                }
                else if(i==0){
                    editmat[i][j]=afirstrow;
                    afirstrow++;
                }
                else if(j==0){
                    editmat[i][j]=bfirstcol;
                    bfirstcol++;
                }
                else{
                    if(a[i].equals(b[j])){
                        editmat[i][j]=min(editmat,i,j);
                    }else{
                        editmat[i][j]=min(editmat,i,j)+1;
                    }

                }
            }

        }
        printGraph(editmat,first.length(),second.length());
        return(editmat[first.length()-1][second.length()-1]);
    }

    private void printGraph(int[][]a,int size1,int size2){
        for(int i =0;i<size1;i++){
            for(int j =0;j<size2;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    private int min(int[][]edit,int i,int j){
        int a = edit[i-1][j];
        int b = edit[i][j-1];
        int c = edit[i-1][j-1];

        return Math.min(Math.min(a, b), c);

    }
    public static void main(String[]args){
        editDistance d = new editDistance();
        System.out.println(d.editDistance("sunday","saturday"));

    }
}
