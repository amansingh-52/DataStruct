package code;

import node.SingleNode;

public class StackCode{
    private SingleNode head;
    private SingleNode tail;
    private int size;

    void setHead(SingleNode head){
        this.head=head;
    }

    SingleNode getHead(){
        return head;
    }

    void setTail(SingleNode tail){
        this.tail=tail;
    }

    SingleNode getTail(){
        return tail;
    }

    void setSize(int size){
        this.size=size;
    }

    int getSize(){
        return size;
    }

    public void createStack(int value){
        SingleNode newNode = new SingleNode();
        newNode.setData(value);
        head=newNode;
        tail=newNode;
        setSize(1);
    }
    public void push(int value){
    if(StackExist()){
        SingleNode nextNode = new SingleNode();
        tail.setNext(nextNode);
        nextNode.setData(value);
        tail=nextNode;
        setSize(getSize()+1);
        }
    }

    public void pop(){
    if(StackExist()){
        SingleNode tempNode = head;
        for(int i=0;i<getSize()-2; i++){
            tempNode=tempNode.getNext();
        }
        tempNode.getNext().setData(0);
        tempNode.setNext(null);
        tail=tempNode;
        setSize(getSize()-1);
        }
    }

    boolean StackExist(){
        return head!=null;
    }

    public void traverse(){
        if(StackExist()){
            SingleNode tempNode = head;
            for(int i=0 ; i<getSize() ; i++){
                System.out.print(tempNode.getData());
                if(i<getSize()-1){
                    System.out.print(" -> ");
                tempNode=tempNode.getNext();
                }
            }
            System.out.println();
        }
        else{
            System.out.println("Stack does not exist!!!");
        }
    }

    public void getTop(){
        if(StackExist()){
            System.out.println(tail.getData());
        }
    }

    public void deleteStack(){
        if(StackExist()){
            head=null;
            tail=null;
            setSize(0);
        }
    }
}