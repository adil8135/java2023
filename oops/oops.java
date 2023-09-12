package oops;

public class oops {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolor("red");
        p1.settip(10);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
        // p1.color="yellow";
        System.out.println(p1.getcolor());
        upi acc1=new upi();
        acc1.username="mohdadil";
        acc1.setpassword("mypassword");
        acc1.seepassword();
    }
}
class upi{
    public String username;
    private String password;
    void setpassword(String pass){
        password=pass;
    }
    void seepassword(){
        System.out.println(password);
    }
}
class pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}