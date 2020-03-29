package src.code;

import java.util.*;

import src.node.*;

public class BinaryTreeLinkedListCode{
    BinaryNode root;

    BinaryTreeLinkedListCode(){
        this.root=null;
    }

    public void insert(int value){
        BinaryNode newNode = new BinaryNode();
        newNode.setData(value);
        if(root==null){
            this.root=newNode;
       //     System.out.println("ROOT node inserted successfully!!!!");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); 
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.getLeft()==null){
                presentNode.setLeft(newNode);
          //      System.out.println("New LEFT node inserted successfully!!!!");
                break;
            }
            else if(presentNode.getRight()==null){
                presentNode.setRight(newNode);
          //      System.out.println("New RIGHT node inseted successfully!!!!");
                break;
            }
            else{
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }

    public void inOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.print(node.getData()+" ");
        inOrderTraversal(node.getRight());
    }

    public void preOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.getData()+" ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    public void postOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.print(node.getData()+" ");
    }
}
