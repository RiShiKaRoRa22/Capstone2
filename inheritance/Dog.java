//package inheritance;

public class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking...");
    }

    public static void main(String[] args){
        Dog obj= new Dog();
        obj.bark();
        obj.eat();
    }
}