package LowestCommonAncestorBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

   private Node head;



    public Node getHead() {
        return head;
    }

    public String addNode(Node node) {

        if (head == null) {
            head = node;
            return ("head is assigned as " + node.getValue());
        }
        return compareAdd(head, node);


    }

    private String compareAdd(Node parent,Node child){
        if(child.getValue()>parent.getValue()){
            if(parent.getRight()!=null){
                return compareAdd(parent.getRight(),child);
            }
            else {
                parent.setRight(child);
                return "Located on the right of at parent number " + parent.getValue();
            }
        }
        else if(child.getValue()<parent.getValue()){
            if(parent.getLeft()!=null){
                return compareAdd(parent.getLeft(),child);
            }
            else {
                parent.setLeft(child);
                return "Located on the left of at parent number " + parent.getValue();
            }
        }
        return "Integer present on binary tree";

    }

    public boolean isBST(Node node){

        if(node ==null){
            return true;
        }
        if(node.getLeft()!=null&& node.getLeft().getValue()>=node.getValue()){
            return false;
        }
        if(node.getRight()!=null&&node.getRight().getValue()<=node.getValue()){
            return false;
        }

        return isBST(node.getRight())&&isBST(node.getLeft());



    }

    public Node LCA(Node root, int x , int y){
        if(root ==null ){
            return null;
        }
        if(root.getValue()==x || root.getValue()==y){
            return root;
        }

        Node LeftSearch = LCA(root.getLeft(),x,y);
        Node RightSearch = LCA(root.getRight(),x,y);

        if(RightSearch == null){
            return LeftSearch;
        }
        if(LeftSearch == null){
            return RightSearch;
        }
        return root;

    }

    public List<Integer> DFSImpl(int find){
        List<Integer> ans = new ArrayList<>();

        DFS(head,find,ans);
        if(!ans.contains(find)){
            return null;
        }

        return ans;
    }

    private List<Integer> DFS(Node start,int find,List<Integer>a){

        if(start.getValue()!=find){
            a.add(start.getValue());

            if(start.getLeft() != null&& start.getLeft().getValue()!=find){
                DFS(start.getLeft(),find,a);
            }

            if(start.getRight()!= null &&start.getRight().getValue()!= find){
                DFS(start.getRight(),find,a);
            }

        }
        if(start.getLeft()!= null &&start.getLeft().getValue() == find || start.getRight()!= null &&start.getRight().getValue()==find){
            a.add(find);

        }
        return a;
    }

    public List<Integer> BFS(int find){
        Queue<Node> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        queue.add(head);

        while(!queue.isEmpty()){


            Node tempNode = queue.poll();
            answer.add(tempNode.getValue());
            if(tempNode.getValue() == find){
                return answer;
            }

            if(tempNode.getLeft()!= null){
                queue.add(tempNode.getLeft());
            }
            if(tempNode.getRight()!= null){
                queue.add(tempNode.getRight());
            }


        }
        if(!answer.contains(find)){
            return null;
        }
        return answer;



    }

    public static void main (String[]args){

        BinarySearchTree b = new BinarySearchTree();
        Node five = new Node();
        five.setValue(5);
        System.out.println(b.addNode(five));

        Node two = new Node();
        two.setValue(2);
        System.out.println(b.addNode(two));

        Node three = new Node();
        three.setValue(3);
        System.out.println(b.addNode(three));

        Node six = new Node();
        six.setValue(6);
        System.out.println(b.addNode(six));

        Node one = new Node();
        one.setValue(1);
        System.out.println(b.addNode(one));

        Node answer = b.LCA(b.head,1,3);
        System.out.println(answer.getValue());

        System.out.println(b.DFSImpl(0));

        System.out.println(b.BFS(0));







    }
}
