public class newYearchaos {

    private void minimumBribes(int[] q) {
        int totalswitch=0;
        for(int i =0;i<q.length;i++){
            if ((q[i]-(i+1))>2){
                System.out.println("Too chaotic");
                return;
            }
            for(int t=0;t<i+1;t++){
                if(q[t]>q[i]){
                    totalswitch++;
                }
            }
        }

        System.out.println(totalswitch);

    }

    public static void main (String[]args){
        newYearchaos newYearchaos = new newYearchaos();
        int[]a = new int[]{1,2,5,3,4,7,8,6};
        newYearchaos.minimumBribes(a);
    }
}
