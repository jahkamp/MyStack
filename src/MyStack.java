
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brendan
 */
public class MyStack {

    private char topNode;
    private ArrayList<Character> stack;

    public MyStack() {
        topNode = ' '; 
        stack = new ArrayList<Character>();
    }

    // stack operations:
    public void push(char node) {
        stack.add(node);
    }

    public char pop() {        
        char poppedNode = ' ';
        if(!stack.isEmpty())
        try {
            poppedNode = stack.get(stack.size() - 1);
            //System.out.println("top index = " + topIndex + " topNode = " + topNode);
            stack.remove(stack.size() - 1);      
        } catch (Exception e) {
           
        }
                return poppedNode;              
    }

    public char peek() {
        if(!stack.isEmpty())
            return stack.get(stack.size() - 1);
        else
            return ' ';
    }

    public void printStack() {
        while (peek() != ' ') {
            System.out.println(pop());
        }
    }
}
