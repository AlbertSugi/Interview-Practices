package Graph;

import java.util.*;

public class graph {

    private int size;
    private List<List<Integer>> adjLst ;

    public graph(int size) {
        this.size = size;
        this.adjLst = new ArrayList<>();
        for(int n =1;n<=size+1;n++){
            adjLst.add(new LinkedList<>());
        }
    }

    public void addEdge(int vertex, int edge){
        adjLst.get(vertex).add(edge);
       // adjLst.get(edge).add(vertex); //undirected graph
    }

    public void printGraph(){
        for(int i=1;i<=size;i++){
            System.out.print(i+"-->");
            System.out.println(adjLst.get(i).toString());


        }

    }
    public void BFSFindNode(int start,int finish){
        Queue<Integer> m = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        if(adjLst.size()-1<finish){
            System.out.println("Number not found");
            return;
        }
        if(start!= finish) {
            for (int i : adjLst.get(start)) {
                m.add(i);
            }
            array.add(start);
        }
        while(!m.contains(finish)){
            try {
                int n = m.poll();
                array.add(n);
                for (int i : adjLst.get(n)) {
                    m.add(i);
                }
            }catch(Exception e){
                System.out.println("Number not found");
                return;
            }

        }
        //array.add(finish);
        System.out.print("current: " +m);
        System.out.println("visited: " +array);
    }

    public void DFSFindNode(int start,int finish){
        Stack<Integer> m = new Stack<Integer>();
        List<Integer> visited = new ArrayList<>();
        if(adjLst.size()-1<finish){
            System.out.println("Number not found");
            return;
        }
        if(start!=finish){
            for(int i : adjLst.get(start)){
                m.push(i);
            }
        }
        while (!m.contains(finish)){
            int v = m.pop();
            visited.add(v);
            for(int i : adjLst.get(v)){
                m.push(i);
            }
        }
        System.out.print("current: " +m);
        System.out.println("visited: " +visited);
    }




    public static void main (String[]args){
        graph graph = new graph(9);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,6);
        graph.addEdge(2,5);
        graph.addEdge(2,4);
        graph.addEdge(1,7);
        graph.addEdge(7,9);
        graph.addEdge(9,8);

        graph.printGraph();
        graph.BFSFindNode(1,5);
        graph.DFSFindNode(1,8);




    }
}
