package code;

public class CircularQueueArrayMain {
    public static void main(String[] args) {
        CircularQueueArrayCode list = new CircularQueueArrayCode();
        list.create(5, 45);
        list.traverse();
        for(int i=0; i<5 ; i++){
            list.enQueue(55+(i*10));
            list.traverse();
        }
        for(int i=0;i<3;i++){
            list.deQueue();
            list.traverse();
        }
        list.traverse();
        list.enQueue(100);
        list.traverse();
        list.enQueue(110);
        list.traverse();
        list.deQueue();
        list.traverse();
        list.enQueue(120);
        list.traverse();
        list.deQueue();
        list.traverse();
        list.deQueue();
        list.traverse();
        list.deQueue();
        list.traverse();
        list.deQueue();
        list.traverse();
    }
}