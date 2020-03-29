package code;

public class CircularQueueArrayCode{
    private int head=-1;
    private int tail=-1;
    private int size=-1;
    private int[] arr=null;

    void create(int size, int data){
        arr=new int[size];
        this.size=size;
        head=0;
        tail=0;
        arr[0]=data;
    }

    private boolean isExist(){
        if(tail==-1){
            System.out.println("Queue does not exist anymore!!!");
            return false;
            }
        else {
            return true;
        }
    }

    private boolean isFull(){
        if(head==0&&tail+1==size){
            System.out.println("Queue is full enable to add more");
            return true;
        }
        else if(tail+1==head){
            System.out.println("Queue is full enable to add more");
            return true;
        }
        else{
            return false;
        }
    }

    void enQueue(int data){
        if(!isFull()&&isExist()){
            tail++;
            if(tail==size){
                tail=0;
            }
            arr[tail]=data;
        }
    }

    void deQueue(){
     if(isExist()){
        arr[head]=Integer.MIN_VALUE;
        if(head+1==size&&head!=tail){
            head=0;
        }
        else{
            head++;
        }
        if(head==size){
            tail=head=-1;
        }
        if(arr[head]==Integer.MIN_VALUE)
            tail=head=-1;
     }
    }

    void traverse(){
        if(isExist()){
            if(head==0){
                for(int i=0; i<=tail ; i++){
                    System.out.print(arr[i]);
                    if(i<tail)
                    {
                        System.out.print(" -> ");
                    }
                }
                System.out.println();
            }
            else if(head<=tail){
                for(int i=head; i<=tail ; i++){
                    System.out.print(arr[i]);
                    if(i<tail){
                        System.out.print(" -> ");
                    }
                }
                System.out.println();
            }
            else if(tail<head){
                for(int i=head ; i<size ; i++){
                    System.out.print(arr[i]);
                    System.out.print(" -> ");
                    }
                for(int i=0;i<=tail;i++){
                    System.out.print(arr[i]);
                    if(i<tail){
                        System.out.print(" -> ");
                    }
                }
                System.out.println();
            }  
        }
    }
}
