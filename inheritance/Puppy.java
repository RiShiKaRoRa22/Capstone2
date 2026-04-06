public class Puppy extends Dog{
    void weep(){
        System.out.println("Pupppy is weeping...");
    }
    public static void main(String[] args){
        Puppy obj= new Puppy();
        obj.bark();
        obj.eat();
        obj.weep();

    }
}