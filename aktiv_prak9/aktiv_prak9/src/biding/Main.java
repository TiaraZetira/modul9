package biding;

class Animal{
    static void suara(){
        System.out.println("Suara Hewan");
    }
    void makan(){
        System.out.println("Hewan Makan");
    }    
}

class Dog extends Animal{
    void makan(){
        System.out.println("Anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();

        Animal.suara();
        a.makan();

        Animal b = new Dog();

        b.makan();
    }
}
