package code;

public class LinearQueueLinkedListMain{
    public static void main(String[] args) {
        LinearQueueLinkedListCode list  =  new LinearQueueLinkedListCode();
        list.create(45);
        list.traverse();
        for(int i=0; i<10 ; i++){
            list.enQueue(55+(i*10));
            list.traverse();
        }
        for(int i=0;i<5;i++){
            list.deQueue();
            list.traverse();
        }
        for(int i=0;i<7;i++){
            list.enQueue(150+(i*10));
            list.traverse();
        }

        list.deleteEntireQueue();
        list.traverse();
    }
}