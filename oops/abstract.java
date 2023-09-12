package oops;

public class abstract {
    
}
abstract class animal{
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("walk on four legs");
    }
}

class chicken extends animal{
    void walk(){
        System.out.println("two legs");
    }
}