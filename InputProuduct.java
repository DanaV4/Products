
package inputprouduct;

import java.util.Scanner;

public class InputProuduct {

    
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in) ;
       System.out.println("enter numbers of prodects : ") ;
       int product=input.nextInt();
       System.out.println("enter price of prodects : ") ;
       int[]price= new int[product];
         for(int i=0;i<price.length;i++){
           price[i]=input.nextInt();
         
       }
       System.out.println("enter name of prodects : ") ;
       String[]name=new String[product];
       
     for (int i=0;i<name.length;i++) {
         name [i]=input.next();
     }
       System.out.println("enter number of product :") ;
       int num=input.nextInt();
       System.out.println("the name of product : " + name[num] + "\n" + "the price : " + price[num]);
       
       
    }
    
}
