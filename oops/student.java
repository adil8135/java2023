package oops;

public class student {
public static void main(String args[]) {
    Innerstudent s1=new Innerstudent();    
    Innerstudent s2=new Innerstudent("adil");    
    Innerstudent s3=new Innerstudent(123);    
    Innerstudent s4 = new Innerstudent(s2,s3);
}
}

class Innerstudent {
    String name;
    int age;
    Innerstudent(Innerstudent s5 , Innerstudent s6){//copy constructor
        System.out.println(this.name=s5.name);
         System.out.println(this.age=s6.age);       
    }
    Innerstudent(){ // nono-parameterized constructor
        System.out.println("yes constructor works....");
    }
    
    Innerstudent(String copyname){ // parameterized constructor
        this.name=copyname;
    }
    Innerstudent(int age){
        this.age=age;
    }

}