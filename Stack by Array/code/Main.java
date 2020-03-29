package code;

public class Main{
    public static void main(String[] args) {
        Code array = new Code();
        array.create(5,40);
        array.showStack();
        array.push(45);
        array.showStack();
        array.push(65);
        array.showStack();
        array.push(75);
        array.showStack();
    //    array.delete();
        array.pop();
        array.showStack();
        array.getTop();
        array.pop();
        array.showStack();
        array.pop();
        array.showStack();
        array.pop();
        array.showStack();
    }
}