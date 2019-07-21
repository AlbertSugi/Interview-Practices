public class maximumIntervalsOverlap {

 /*   arrl[] = {1, 2, 9, 5, 5}
    exit[] = {4, 5, 12, 9, 12}*/

    public int maxInter(int[]arrival,int[]depart){

        //find earliest arrival
        int earlyarr = 24;
        for(int i : arrival){
            if(i<earlyarr){
                earlyarr = i;
            }
        }
        //find latest exit

        int latestdep = 1;
        for(int t:depart){
            if(t>latestdep){
                latestdep=t;
            }
        }

        int answer = 1;
        int occurmax = 0;


        for(int i =earlyarr;i<=latestdep;i++){
            int occur = 0;
            for(int t = 0 ;t<arrival.length;t++){
                if(arrival[t]<=i & depart[t]>=i){
                    occur++;
                }

                }
            if(occur>occurmax){
                occurmax = occur;
                answer=i;
            }

        }


        return answer;


    }

    public static void main (String[]args){

        maximumIntervalsOverlap max = new maximumIntervalsOverlap();
        int[] arrl = {1, 2, 9, 5, 5};
        int []exit = {4, 5, 12, 9, 12};
        System.out.println(max.maxInter(arrl,exit));
    }
}
