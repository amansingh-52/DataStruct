package src.node;

public class BinaryNode{
    private int data;
    private int height;
    private BinaryNode right;
    private BinaryNode left;
    
    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }

    public void setLeft(BinaryNode left){
        this.left=left;
    }

    public BinaryNode getLeft(){
        return left;
    }

    public void setRight(BinaryNode right){
        this.right=right;
    }

    public BinaryNode getRight(){
        return right;
    }
}

