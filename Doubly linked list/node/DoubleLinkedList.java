package node;

public class DoubleLinkedList{
    private int data;
    private DoubleLinkedList next;
    private DoubleLinkedList prev;

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setNext(DoubleLinkedList next){
        this.next=next;
    }

    public DoubleLinkedList getNext(){
        return next;
    }

    public void setPrev(DoubleLinkedList prev){
        this.prev=prev;
    }

    public DoubleLinkedList getPrev(){
        return prev;
    }
}