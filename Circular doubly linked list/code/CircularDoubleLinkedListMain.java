package code;

import code.CircularDoubleLinkedListCode;

public class CircularDoubleLinkedListMain{
    public static void main(String[] args) {
        CircularDoubleLinkedListCode list1 = new CircularDoubleLinkedListCode();
        list1.createLinkedList(45);
        list1.traverse();
        list1.insert(1,50);
        list1.traverse();
        list1.insert(500,55);
        list1.traverse();
        list1.insert(2,60);
        list1.traverse();
        list1.insert(2,65);
        list1.traverse();
        list1.insert(2,70);
        list1.traverse();
        list1.insert(4,75);
        list1.traverse();
        list1.reverseTraverse();
    }   
}