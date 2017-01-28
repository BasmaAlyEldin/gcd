/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author bassma
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
     public static int gcd3(int x,int y)
     {
        if(x>y) 
        {
            return gcd3(x-y,y);
        }
        if(y>x)
        {
            return gcd3(x,y-x);
        }
        else
        {
            return y;
        }
     }
    
    public static int gcd2(int x,int y)
    {
        if(y==0)
        {
            return x;
        }
        else
        {
            return gcd2(y,x%y);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     int num1=in.nextInt();
     int num2=in.nextInt();
    // 
   /*  for(int i=Math.max(num1,num2);i>=1;i--)
     {
         if(num1%i==0 && num2%i==0)
         {
             System.out.println(i); 
             break;
         }
     }//*/
      System.out.println(gcd2(num1,num2));
       System.out.println(gcd3(num1,num2));
     if(num2==0)
     {
         System.out.println(num1); 
     }
     else
     { 
        int z=num1%num2;
        while(num2!=0)
        {
            int temp=num1;
            
            num1=num2;
            num2=temp%num2;
            
            
        }
         System.out.println(num1);
        
     }
    }
}
