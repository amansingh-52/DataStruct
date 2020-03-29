package code;

public class Code{
    private int current=-1;
    private int size=0;
    int arr[]=null;
    public void create(int size, int value){
        this.arr = new int[size];
        arr[0]=value;
        current=0;
        this.size=size;
    }

    public void push(int value){
        if(arrayExist()){
            if(current<size){
                arr[current+1]=value;
                current++;
            }
            else{
                System.out.println("Stack Full!!!!");
            }
        }
    }

    public void pop(){
        if(arrayExist()){
              arr[current]=Integer.MIN_VALUE;
              current--;
        }
    }

    public void getTop(){
        if(arrayExist()){
            System.out.println(arr[current]);
        }
    }

    public void showStack(){
        if(arrayExist()){
            for(int i=0; i<=current ; i++){
                System.out.print(arr[i]);
                if(i<current)
                System.out.print(" -> ");
            }System.out.println();
        }
        else{
            return;
        }   
    }

    public void delete(){
        arr=null;
        current=-1;
        size=0;
    }

    boolean arrayExist(){
        if(current==-1||arr==null){
            return false;
        }
        else {
         return true;
        }
    }
}