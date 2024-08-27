/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nocaa;
import java.util.Scanner;
/**
 *
 * @author CL3-PC30
 */
public class Nocaa {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
         System.out.println("[1] = Snacks");
        System.out.println("[2] = Drinks");
        
        
        System.out.println("Enter your choice: ");
        int ch1 = input.nextInt();
        
        if (ch1==1)
        {
             System.out.println("[1] = Piatos [17 Pesos]");
             System.out.println("[2] = Nova [18 Pesos");
             System.out.println("Enter your snack choice: ");
             int ch2 = input.nextInt();
            
            if (ch2==1)
            {
                 System.out.println("Piatos 17 Pesos");
                   int pia, nov;
                   pia = 17;
                   nov = 18;
                   
                   System.out.println("Would you like to order drinks? [1] - Yes [2] - No");
                   int ch3 = input.nextInt();
                   
                   if (ch3==1)
                   {
                        System.out.println("Drinks");
                        System.out.println("[1] = Coke 15 Pesos");
                        System.out.println("[2] = Water 10 Pesos");
                   
                   
                        System.out.println("Enter the drinks of your choice: ");
                        int ch4 = input.nextInt();
                        int coke, water;
                        coke = 15;
                        water = 10;
                        
                        if (ch4==1)
                        {
                            System.out.println("Coke 15 Pesos");
                            int tot;
                            tot = pia + coke;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        //pia and water
                        else if (ch4==2)
                        {
                            System.out.println("Water 10 Pesos");
                            int tot;
                            tot = pia + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                   }
            }
            //nova
            else if (ch2==2)
            {
                System.out.println("Nova 18 Pesos");
                   int pia, nov;
                   pia = 17;
                   nov = 18;
                   
                   System.out.println("Would you like to order drinks? [1] - Yes [2] - No");
                   int ch3 = input.nextInt();
                   
                   if (ch3==1)
                   {
                        System.out.println("Drinks");
                        System.out.println("[1] = Coke 15 Pesos");
                        System.out.println("[2] = Water 10 Pesos");
                   
                   
                        System.out.println("Enter the drinks of your choice: ");
                        int ch4 = input.nextInt();
                        int coke, water;
                        coke = 15;
                        water = 10;
                        
                        if (ch4==1)
                        {
                            System.out.println("Coke 15 Pesos");
                            int tot;
                            tot = nov + coke;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                        //nova and water
                        else if (ch4==2)
                        {
                            System.out.println("Water 10 Pesos");
                            int tot;
                            tot = nov + water;
                            System.out.println("Total is " + tot );
                            System.out.println("Enter your cash");
                            int cash = input.nextInt();
                            
                            while(cash<tot)
                            {
                            System.out.println("Try again");
                            System.out.println("Enter your cash");
                            cash = input.nextInt();
                            }
                            
                            if(cash>=tot)
                            {
                                int chng;
                                chng = cash - tot;
                                System.out.println("Change is: "+chng);
                            }
                        }
                   }
            }
        }
        
         else
        {
            System.out.println("Cancelled Order");
        }
    }
}
