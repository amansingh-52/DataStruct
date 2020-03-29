package node;

public class SingleNode{
    private int data;
    private SingleNode next;

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setNext(SingleNode next){
        this.next=next;
    }

    public SingleNode getNext(){
        return next;
    }
}