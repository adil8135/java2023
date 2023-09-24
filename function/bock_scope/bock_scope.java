package function.bock_scope;

public class bock_scope {
    public static void main(String[] args) {
        {
            int a=5;
            System.out.println(a);

        }
        System.out.println(a);//undefine variable i error
        for (int i = 0; i < args.length; i++) {
            
        }

        System.out.println(i);//undefine variable i error
    }
}
