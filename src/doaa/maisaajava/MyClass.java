package doaa.maisaajava;

import java.util.Scanner;

public class MyClass {
    Scanner  sr = new Scanner(System.in);
    int count = 0;
    public void printMsg(String str){
      System.out.println(str);
    }
    public void guesMyNumber(int num){
       
      int randnum =(int)(Math.random()*11);
         System.out.println(randnum);
     while( count < 2){
      if (num == randnum){
          System.out.println("congradulations you guse the number");
          break;
      }else{
       System.out.println("try again");
             count++;

      System.out.println("Enter the number :");
      
        int newNum = sr.nextInt();
          guesMyNumber(newNum);
      }
    }
     System.out.println("over");
 }  
}
