package com.mycompany.dicerollingapp;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Hunter
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int winStreak = 0;
        double totalWins = 0;
        double totalLoss = 0;
        int totalTies = 0;
        int totalGames = 0;
        
        
        
        System.out.println("How many sides on dice?");
        int sidedDice = scan.nextInt();
        
        boolean running = true;
        
        
        while(running)
        {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Win Streak: " + winStreak);
            System.out.println("Total Wins: " + (int)totalWins + "\t Total Loss: " + (int)totalLoss + "\t Total Ties: " + totalTies);
            if(totalLoss>0) {
            System.out.println("Win/Loss Ratio: " + (totalWins/totalLoss));                
            }
            System.out.println("Total Games: " + totalGames);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("");
            
            System.out.println("Roll again? [Press ENTER]");
            String input = scan.nextLine();
            
            int playerRoll = random.nextInt(sidedDice);
            int opponentRoll = random.nextInt(sidedDice);
            System.out.println("");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Your Roll: "+ (playerRoll + 1));
            System.out.println("Opponent Roll: " + (opponentRoll + 1));
            System.out.println("");
            
            totalGames++;
            if(playerRoll > opponentRoll)
            {
                winStreak++;
                totalWins++;
            }
            else if(playerRoll < opponentRoll)
            {
                winStreak = 0;
                totalLoss++;
            }
            else
            {
                totalTies++;
            }
            
            
        }
    }
   
    

}
