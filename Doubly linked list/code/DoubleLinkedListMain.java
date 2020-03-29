package code;

public class DoubleLinkedListMain{
    public static void main(String[] args) {
        DoubleLinkedListCode list1 = new DoubleLinkedListCode();
        list1.create(45);
        list1.traverse();
        list1.insertion(1, 50);
        list1.traverse();
        list1.insertion(500, 70);
        list1.traverse();
        list1.insertion(2, 80);
        list1.traverse();
        list1.insertion(2, 90);
        list1.traverse();
        list1.insertion(3, 100);
        list1.traverse();
     //   list1.find(80);
        list1.deleteNode(5);
        list1.traverse();
    //    list1.deleteEntireLinkedList();
    //   list1.traverse();
        list1.traverseBack();
    }
}