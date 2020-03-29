package code;

import node.*;

public class LinearQueueLinkedListCode{
    private SingleNode head = null;
    private SingleNode tail = null;
    private int size = -1;

    void create(int value){
        SingleNode newNode = new SingleNode();
        head=newNode;
        tail=newNode;
        newNode.setData(value);
        size=1;
    }

    private boolean isExist(){
        if(head==null||size==-1){
            System.out.println("Queue does not exist");
            return false;
        }
        else{
            return true;
        }
    }

    void enQueue(int value){
     if(isExist()){
        SingleNode newNode = new SingleNode();
        tail.setNext(newNode);
        newNode.setData(value);
        tail=newNode;
        size++;
     }
    }

    void deQueue(){
     if(isExist()){
        head=head.getNext();
        size--;
     }
    }

    void traverse(){
        if(isExist()){
            SingleNode tempNode = head;
            while(tempNode!=null){
                System.out.print(tempNode.getData());
                tempNode=tempNode.getNext();
                if(tempNode!=null){
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    void deleteEntireQueue(){
        head=null;
        tail=null;
        size=-1;
        System.out.println("Deleted!!");
    }
}