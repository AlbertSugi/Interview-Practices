import java.util.Stack;

public class createQueueUsingStack {
    private Stack<Integer> temp = new Stack<>();

    private Stack<Integer> real = new Stack<>();


    public void setReal(Stack<Integer> real) {
        this.real = real;
    }

    public Stack<Integer> getReal() {
        return real;
    }

    public void Dequeue (){
        while(!real.empty()){
        temp.push(real.pop());
    }
        temp.pop();

        while(!temp.empty()){
            real.push(temp.pop());
        }

    }
    public void Enqueue(int num){
        real.push(num);
    }


    public static void main(String []args){
        Stack<Integer> n = new Stack<>();
        n.push(1);
        n.push(2);
        n.push(3);
        n.push(4);
        n.push(5);
        n.push(6);
        createQueueUsingStack cc = new createQueueUsingStack();
        cc.setReal(n);
        cc.Enqueue(7);
        System.out.println(cc.getReal());

        cc.Dequeue();
        System.out.println(cc.getReal());


    }
}
