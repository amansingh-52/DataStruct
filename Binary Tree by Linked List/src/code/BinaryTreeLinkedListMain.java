package src.code;

public class BinaryTreeLinkedListMain{
    public static void main(String[] args) {
    BinaryTreeLinkedListCode list = new BinaryTreeLinkedListCode();
    for(int i=0;i<50;i++){
        list.insert(10+(i*5));
    }
    System.out.println("In order traversal :");
    list.inOrderTraversal(list.root);
    System.out.println();
    System.out.println("Post order traversal :");
    list.postOrderTraversal(list.root);
    System.out.println();
    System.out.println("Pre order traversal :");
    list.preOrderTraversal(list.root);
    System.out.println();
    }
}