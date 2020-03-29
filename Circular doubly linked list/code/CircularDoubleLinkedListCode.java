package code;

import node.DoubleLinkedList;

class CircularDoubleLinkedListCode{
    private DoubleLinkedList head;
    private DoubleLinkedList tail;
    private int size;

    public void createLinkedList(int value){
        DoubleLinkedList node = new DoubleLinkedList();
        node.setNext(node);
        node.setPrev(node);
        node.setData(value);
        head=node;
        tail=node;
        size=1;
    }

    boolean LinkedListExist(){
        return head!=null;
    }

    public void traverse(){
        if(LinkedListExist()){
            DoubleLinkedList temp = head;
            for(int i=0; i<size ; i++){
                System.out.print(temp.getData());
                temp=temp.getNext();
                if(i<size-1){
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void insert(int location, int value){
        if(LinkedListExist()){
            DoubleLinkedList newNode = new DoubleLinkedList();
            newNode.setData(value);
            if(location==1){
                newNode.setPrev(tail);
                newNode.setNext(head);
                head.setPrev(newNode);
                head=newNode;
            }
            else if(location>size){
                tail.setNext(newNode);
                newNode.setPrev(tail);
                newNode.setNext(head);
                tail=newNode;
            }
            else{
                DoubleLinkedList tempNode = head;
                for(int i=0;i<location-2;i++){
                    tempNode=tempNode.getNext();
                }
                newNode.setNext(tempNode.getNext());
                tempNode.getNext().setPrev(newNode);
                tempNode.setNext(newNode);
                newNode.setPrev(tempNode);
            }
            size++;
        }
    }

    public void reverseTraverse(){
        if(LinkedListExist()){
            DoubleLinkedList temp = tail;
            for(int i=size ; i>0; i--){
                System.out.print(temp.getData());
                temp=temp.getPrev();
                if(i!=1){
                    System.out.print(" <- ");
                }
            }
            System.out.println();
        }
    }
}