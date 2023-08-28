/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
import java.util.*;



public class MyClass {
    public static int numberGame()
    { Scanner scn=new Scanner(System.in);
    int won=0;
    int score=0;
        int number1;
     Random random=new Random();
     number1=random.nextInt(10)+10;
     System.out.println("Enter a number between 10 to 20");
     int number2=scn.nextInt();
     
     if(number2>20&&number2<10)
        System.out.println("Wrong Entry! Try again:(") ;
    
     else
     {
         for(int i=1;i<=3;i++)
         { if(number2>20||number2<10)
         {
        System.out.println("Wrong Entry! Try again:(") ;
          number2=scn.nextInt();
          continue;
         }
             if(number1==number2)
         {   won=1;
            System.out.println("Congratulations!Your Guess was Correct");
            break;
         }
             int num=number1-number2;
             if(num<=2&&num>=-2)
             {
              System.out.println("You are close");
              number2=scn.nextInt();
              continue;
             }
             else if (num<-2)
              {
              System.out.println("You are too high");
              number2=scn.nextInt();
              continue;
             }
             else if(num>2)
              {
              System.out.println("You are too low");
              number2=scn.nextInt();
              continue;
             }
             
             
         }
         
     }
     if(won==1)
         return won;
    else 
         return number1;
        }
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int score=0;
        int sc;
        System.out.println("Game Rules:");
        System.out.println("1.Select a number. ");
         System.out.println("2.If the number is equal to the generated number,you win.");
         System.out.println("3.You will be given 3 attempts for guessing the number. ");
         System.out.println("Do you want to start the game?(type 1 for yes/0 for no)");
         int reply=scn.nextInt();
         
        if (reply==1)
         {for(int i=1;1<=10;i++)
         {  sc=numberGame();
            score += sc;
            if(score>=1&&score<10)
             System.out.println("Your Score is "+ score);
            else
              System.out.println("Sorry!You lose.The number was "+ sc);
            System.out.println("Do you want to try again?(type 1 for yes/0 for no)");
            int rep=scn.nextInt();
            if(rep==1)
              continue;
            else if(rep==0)
         {
               System.out.print("Game ended");
               break;
         }
         else{
             System.out.print("Wrong entry.Please try again");
         }
         
         
            
         }
             
         }
        else if(reply==0)
         {
             System.out.print("Game ended");
         }
        else{
             System.out.print("Wrong entry.Please try again");
         }
         
         
         
     
     
    }
    
}


