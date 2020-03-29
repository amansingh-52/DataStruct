package code;

public class StackMain{
    public static void main(String[] args) {
        StackCode list1 = new StackCode();
        list1.createStack(45);
        list1.traverse();
        list1.push(55);
        list1.traverse();
        list1.push(65);
        list1.traverse();
        list1.push(75);
        list1.traverse();
        list1.push(85);
        list1.traverse();
        list1.push(95);
        list1.traverse();
        list1.pop();
        list1.traverse();
        list1.getTop();
        list1.deleteStack();
        list1.traverse();
    }
}