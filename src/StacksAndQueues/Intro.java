package StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class Intro {
    public static void main(String[] args) {
        //Inbbuilt Stack
       /* Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(23);
        stack.push(4);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        */

        Queue<Integer> q = new ArrayDeque<>();
        q.add(3);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(7);

        System.out.println(q.peek());// it gets the item but does not remove the item
        System.out.println(q.remove());
    }
}
