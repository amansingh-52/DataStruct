package code;

public class LinearQueueArrayMain{
    public static void main(String[] args) {
        LinearQueueArrayCode list1 = new LinearQueueArrayCode();
        list1.create(10,45);
        list1.traverse();
        list1.enQueue(55);
        list1.traverse();
        list1.enQueue(65);
        list1.traverse();
        list1.enQueue(75);
        list1.traverse();
        list1.enQueue(85);
        list1.traverse();
        list1.enQueue(95);
        list1.traverse();
        list1.enQueue(105);
        list1.traverse();
        list1.enQueue(115);
        list1.traverse();
        list1.enQueue(125);
        list1.traverse();
        list1.enQueue(135);
        list1.traverse();
        list1.enQueue(145);
        for(int i=0; i<11 ; i++){
        list1.deQueue();
        list1.traverse();
        }
    }
}