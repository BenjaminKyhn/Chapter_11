import java.util.ArrayList;

public class MyStack2 extends java.util.ArrayList{
    private java.util.ArrayList<Object> list;

    public MyStack2(){
        list = new java.util.ArrayList<Object>();
    }

    // Add a new element to the top of the stack
    public void push(Object o){
        list.add(0,o);
    }

    // Return the top element in this stack without removing it
    public Object peek(){
        return list.get(0);
    }

    // Return and remove the top element of the stack
    public Object pop(){
        Object o = list.get(0);
        list.remove(0);
        return o;
    }

    // Return a string of all elements in the stack
    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
}
