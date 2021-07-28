

import java.util.Scanner;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String opponentmove=" ";

    //LOOP THROUGH AND KEEP ASKING THE USER TO ENTER THE MOVE
    while(true)
    {
      System.out.print("ENTER YOUR MOVE(STONE,PAPER,SCISSOR).IF YOU WANT TO EXIT THE GAME TYPE IN QUIT:");
      String mymove=in.nextLine();

      //CHECK IF THE USER ENTERED QUIT
      if(mymove.equals("quit"))
      {
        break;
      }

      //VERIFY IF MY MOVE IS VALID
      if(!mymove.equals("stone") && !mymove.equals("paper") && !mymove.equals("scissor"))
      {
        System.out.println("YOUR MOVE ISN'T VALID");
      }
      else
      {
        //RANDOMLY GENERATE THE OPPONENT  MOVE(0,1,2)

        int rand=(int)(Math.random() * 3);
      
        if(rand==0)
        {
          opponentmove="stone";
        }
        else if(rand==1)
        {
          opponentmove="paper";
        }
        else
        {
          opponentmove="scissor";
        }
        System.out.println("OPPONENT MOVE:"
        + opponentmove);
      }


      //CALCULATE IF THE USER WON OR LOST OR TIED
      if(mymove.equals(opponentmove))
      {
        System.out.println("YOU TIED");
      }
      else if((mymove.equals("stone") && opponentmove.equals("scissor")) || (mymove.equals("scissor") && opponentmove.equals("paper")) ||(mymove.equals("paper") && opponentmove.equals("stone")))
      {
        System.out.println("YOU WON");
      }
      else
      {
        System.out.println("YOU LOST");
      }
    }
    System.out.println("Thanks for Playing!");

    






  }
}