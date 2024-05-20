import java.util.Scanner;
public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv tv = new SmartTv();
        System.out.println(tv.ligada);
        tv.ligar();
        System.out.println(tv.ligada);
        System.out.println(tv.aumentar());
        System.out.println(tv.aumentar());
        tv.trocarCanal();
        tv.trocarCanal(14);
    }
}
