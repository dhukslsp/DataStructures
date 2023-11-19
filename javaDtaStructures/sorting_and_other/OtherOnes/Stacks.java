package javaDtaStructures.sorting_and_other.OtherOnes;

import java.util.Stack;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Stacks {
    private int arr[];
    private int size;
    private int top;
    Stacks(int size){
        arr = new int[size];
        this.size = size;
        this.top = -1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        else{
            System.out.println("Inserting :"+data);
            arr[top+=1] = data;
        }
    }
    public Boolean isFull(){
        return top >= size - 1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public int getSize(){
        return top + 1;
    }
    public void printStack(){
        for(int i = 0;i<top+1;i++){
            System.out.println(arr[i]);
        }
    }
    public void popOperation(){
        if(isEmpty()){
            System.out.println("Empty Stack  ");
        }
        else{
            top -= 1;
        }
    }
    public static void main(String[] args) {
        Stacks myStacks = new Stacks(2);
        myStacks.push(12);
        myStacks.push(154);
        myStacks.printStack();
        myStacks.popOperation();
        myStacks.printStack();
    }
}
