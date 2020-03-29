package code;

public class LinearQueueArrayCode {
    private int head=-1;
    private int tail=-1;
    private int size=-1;
    private int[] arr=null;

    private void setHead(int head){
        this.head=head;
    }

    private int getHead(){
        return head;
    }

    private void setTail(int tail){
        this.tail=tail;
    }

    private int getTail(){
        return tail;
    }

    private void setsize(int size){
        this.size=size;
    }    

    private int getSize(){
        return size;
    }

    void create(int size, int value){
        setsize(size);
        arr = new int[getSize()];
        arr[0]=value;
        setHead(0);
        setTail(0);
    }

    private boolean isFull(){
        return getTail()==getSize()-1;
    }

    void enQueue(int value){
        if(!isFull()){
            setTail(getTail()+1);
            arr[getTail()]=value;
        }
        else{
            System.out.print("Queue Full!!!\t");
            System.out.println("Try deQueueing :(");
        }
    }

    void deQueue(){
        if(getHead()<=getTail()){
            System.out.println(arr[getHead()]+" deQueued");
            setHead(getHead()+1);
        }
        else{
            System.out.println("Nothing to deQueue");
        }
    }

    void traverse(){
        for(int i=getHead() ; i<=getTail(); i++){
            System.out.print(arr[i]);
                if(i<getTail()){
                    System.out.print(" -> ");
                }
        }
        System.out.println();
    }
}