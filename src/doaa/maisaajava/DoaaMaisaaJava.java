package doaa.maisaajava;
import java.util.Scanner;

public class DoaaMaisaaJava {
    public static void main(String[] args) {
         Scanner  sr = new Scanner(System.in);
        
        System.out.println("My first java program in RBK");
        MyClass obj1= new MyClass();
        obj1.printMsg("Hi Dodo");
        
        System.out.println("Enter the number :");
        int num = sr.nextInt();
        
        obj1.guesMyNumber(num);
        
     
    }
    
}
