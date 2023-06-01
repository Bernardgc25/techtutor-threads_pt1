
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        int fnum, lnum; 
      
        System.out.print("Enter first number:");
        fnum = sc.nextInt(); 

        System.out.print("Enter last number:");
        lnum = sc.nextInt(); 

        System.out.print("Before method execution");
        System.out.println("Milliseconds: "+ System.currentTimeMillis());

        Listloader l = new Listloader(); 
        l.loadlist(fnum, lnum);
    
        System.out.print("After method execution");
        System.out.println("Milliseconds: "+ System.currentTimeMillis());
    }
}
