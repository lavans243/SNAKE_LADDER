package com.bridgelabz;

import java. util.*;

public class SnakeLadder {


    public static void main(String[] args) {

        int playerPosition = 0;
        int playerPosition2 = 0;
        int roll = 0;
        int count = 0;

        while (playerPosition<100 || playerPosition2<100)
        {
            roll++;

            count += 1;

            int dice = (int)(Math.random() * 6);

            if(dice ==1)
            {
                System.out.println("The Dice 1 output is One");
            }
            else 
            	if(dice ==2)
            	{
                System.out.println("The Dice 1 output is Two");
            }
            else
            	if(dice ==3) 
            	{
                System.out.println("The Dice 1 output is Three");
            }
            else
            	if(dice ==4)
            	{
                System.out.println("The Dice 1 output is Four");
            }
            else 
            	if(dice ==5)
            {
                System.out.println("The Dice 1 output is Five");
            }
            else 
            {
                System.out.println("The Dice 1 output is Six");
            }


            int checkPlay = (int)(Math.random() * 3);

            if(checkPlay ==1)
            {
                System.out.println("The player 1 gets No Play");
                playerPosition += 0;
                System.out.println("The player 1 moves to " + playerPosition);
            }
            else 
            	if(checkPlay ==2) 
            {
                System.out.println("The player 1 gets Ladder");
                if(dice+playerPosition>100)
                {
                    playerPosition = dice;
                    System.out.println("The player 1 moves to " + playerPosition);
                }
                else
                {
                    playerPosition += dice;
                    System.out.println("The player 1 moves to " + playerPosition);
                }
            }
            else 
            {
                System.out.println("The player 1 gets Snake");
                
                if(playerPosition<dice) 
                {
                    playerPosition = 0;
                    System.out.println("The player 1 stays at " + playerPosition);
                }
                
                else
                {
                    playerPosition -= dice;
                    System.out.println("The player 1 moves to " + playerPosition);
                }
            }

            System.out.println("**********************");

          
            int dice2 = (int)(Math.random() * 6);

            if(dice2 ==1)
            {
                System.out.println("The Dice 2 output is One");
            }
            
            else 
            	if(dice2 ==2) 
            	{
                System.out.println("The Dice 2 output is Two");
            }
            else 
            	if(dice2 ==3)
            	{
                System.out.println("The Dice 2 output is Three");
            }
            else 
            	if(dice2 ==4)
            	{
                System.out.println("The Dice 2 output is Four");
            }
            else
            	if(dice2 ==5)
            {
                System.out.println("The Dice 2 output is Five");
            }
            else
            {
                System.out.println("The Dice 2 output is Six");
            }


            int checkPlay2 = (int)(Math.random() * 3);

            if(checkPlay2 ==1) 
            {
                System.out.println("The player 2 gets No Play");
                playerPosition2 += 0;
                System.out.println("The player 2 moves to " + playerPosition2);
            }
            else 
            	if(checkPlay2 ==2) 
            {
                System.out.println("The player 2 gets Ladder");
                if(dice2+playerPosition2>100)
                {
                    playerPosition2 = dice2;
                    System.out.println("The player 2 moves to " + playerPosition2);
                }
                else
                {
                    playerPosition2 += dice2;
                    System.out.println("The player 2 moves to " + playerPosition2);
                }
            }
            
            else 
            {
                System.out.println("The player 2 gets Snake");
                if(playerPosition2<dice2)
                {
                    playerPosition2 = 0;
                    System.out.println("The player 2 stays at " + playerPosition2);
                }
                else
                {
                    playerPosition2 -= dice2;
                    System.out.println("The player 2 moves to " + playerPosition2);
                }
            }
            
            System.out.println("*****************");

        }
        System.out.println("The dice count is " + count);

        if (playerPosition>playerPosition2){
            System.err.println("Player 1 wins the game");
        }
        else
        {
            System.err.println("Player 2 wins the game");
        }
    }
}
	

