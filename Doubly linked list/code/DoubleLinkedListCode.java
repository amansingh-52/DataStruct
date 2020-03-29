package code;

import node.*;

public class DoubleLinkedListCode{
    private DoubleLinkedList head;
    private DoubleLinkedList tail;
    private int size=0;

    void setHead(DoubleLinkedList head){
        this.head=head;
    }

    DoubleLinkedList getHead(){
        return head;
    }

    void setTail(DoubleLinkedList tail){
        this.tail=tail;
    }

    DoubleLinkedList getTail(){
        return tail;
    }

    void setSize(int size){
        this.size=size;
    }

    int getSize(){
        return size;
    }

    public void create(int data){
        DoubleLinkedList node = new DoubleLinkedList();
        head=node;
        tail=node;
        node.setData(data);
        System.out.println("New Double Linked List Created");
        setSize(1);
    }

    public void traverse(){
        if(doubleLinkedListExist()){
           DoubleLinkedList tempNode = head;
           for(int i=0; i<getSize() ; i++){
             System.out.print(tempNode.getData());
             tempNode=tempNode.getNext();
              if(i<getSize()-1)
                    System.out.print(" -> ");
           }
           System.out.println();
        }
        else {
            System.out.println("Double Linked List does not exist!!!");
        }   
    }

    boolean doubleLinkedListExist(){
        return head!=null;
    }

    public void insertion(int location, int data){
        if(doubleLinkedListExist()){
            DoubleLinkedList newNode = new DoubleLinkedList();
            newNode.setData(data);
            if(location==1){
                head.setPrev(newNode);
                newNode.setNext(head);
                head=newNode;
            }
            else if(location>=getSize()){
                newNode.setPrev(tail);
                tail.setNext(newNode);
                tail=newNode;
            }
            else{
                DoubleLinkedList tempNode = head;
                for(int i=1; i<location-1 ; i++){
                    tempNode=tempNode.getNext();
                }
                tempNode.getNext().setPrev(newNode);
                newNode.setNext(tempNode.getNext());
                tempNode.setNext(newNode);
                newNode.setPrev(tempNode);
            }
        }
        setSize(getSize()+1);
    }

    public void find(int data){
        if(doubleLinkedListExist()){
            if(head.getData()==data){
                System.out.println(data+ " found on location :- 1");
            }
            else if(tail.getData()==data){
                System.out.println(data+ " found on location :- "+getSize());
            }
            else{
                DoubleLinkedList tempNode = head;
                int i=1;
                while(tempNode.getData()!=data){
                    tempNode=tempNode.getNext();
                    if(tempNode.getData()==data){
                        System.out.println(data+ " found on location :- "+(i+1));
                    }
                    i++;
                    if(!(i<getSize())){
                        System.out.println("Value not found!!!");
                        return;
                    }
                }
            }
        }
    }

    public void deleteNode(int location){
        if(doubleLinkedListExist()){
            if(location==1){
                head.getNext().setPrev(null);
                head=head.getNext();
            }
            else if(location>=getSize()){
                tail.getPrev().setNext(null);
                tail=tail.getPrev();
            }
            else{
                DoubleLinkedList tempNode = head;
                for(int i=2; i<location ; i++){
                    tempNode=tempNode.getNext();
                }
                tempNode.getNext().getNext().setPrev(tempNode);
                tempNode.setNext(tempNode.getNext().getNext());
            }
            setSize(getSize()-1);
            System.out.println("Deleted!!");
        }
    }

    public void traverseBack(){
        if(doubleLinkedListExist()){        
            DoubleLinkedList temp = tail;
            for(int i=getSize(); i>=1 ; i--){
                System.out.print(temp.getData());
                temp=temp.getPrev();
                if(i>1){
                    System.out.print(" <- ");
                }
            }
            System.out.println();
        }
    }

    public void deleteEntireLinkedList(){
        DoubleLinkedList temp = head;
        for(int i=0 ; i< getSize() ; i++){
            temp.setPrev(null);
            temp=temp.getNext();
        }
        head=null;
        tail=null;
        setSize(0);
        System.out.println("Linked List deleted!!!");
    }
}