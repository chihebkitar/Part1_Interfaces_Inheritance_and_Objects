package oop;

public class StoreNumbers {
    private boolean[] numbers = new boolean[100];
    public void store(int num){
        numbers[num] = true;
    }
    public boolean isStored(int num){
        return numbers[num];
    }
    public static void main(String[] args){
        StoreNumbers sn = new StoreNumbers();
        System.out.println(sn.isStored(2));
        sn.store(2);
        System.out.println(sn.isStored(2));
    }
    // we used this example to show the importance of
    // hashcode methode which does the
    // converting  of the objs to integers
    // to enable rapid lockups for stored obj
    // if equals true the hashcode true

}
