package dsa.stack;

import java.util.Arrays;

public class StackImpl {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for(int i =1;i<11;i++){
            stack.push(i*3);
        }
        stack.printStack();
        System.out.println("Is the stack full: " +(stack.isFull()? "yes" :"No"));

        for(int i=0;i<5;i++){
            stack.pop();
        }
        System.out.println("After popping from stack: ");
        stack.printStack();
        System.out.println("Stack peek value: " + stack.peek());
        System.out.println("Is the stack full: " +(stack.isFull()?"yes" :"No"));
        System.out.println("Is the stack empty: "  +(stack.isEmpty()?"yes" :"No"));
        System.out.println("Stack capacity: " +stack.capacity);

    }
}
class Stack{
    int[] stackImpl;
    int top;
    int capacity;

    public Stack(int capacity){
        this.capacity = capacity;
        this.stackImpl = new int[capacity];
        this.top = -1;

    }

    public void push(int data){
        if(isFull()){
            System.out.println("The stack is full");
            return;
        }
        top++;
        stackImpl[top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int data = stackImpl[top];
        stackImpl[top] =0;
        top--;
        return data;
    }
    public int peek(){
        return stackImpl[top];
    }
    public boolean isFull(){
        return stackImpl.length-1 == top;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        Arrays.stream(stackImpl).forEach(System.out::println);
    }
}
