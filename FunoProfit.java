package com.mycompany.funoprofitapp;
import java.util.Scanner; //Import Scanner Class
/**
 * This calculates the Revenue, Revenue after Shipping, and Profit
 * of shirts and hoodies. This can be used to calculate past numbers,
 * or to project and gauge future $$$.
 * @author Hunter
 */
public class FunoProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input # of shirts sold: ");
        int shirtSold = scan.nextInt(); //reads user input
        
        System.out.print("Input # of hoodies sold: ");
        int hoodieSold = scan.nextInt();
        
        int shirtPrice = 28; //$25 base + $3 shipping
        int hoodiePrice = 58; //$50 base + $8 shipping
        int manufactureShirt = 12; //$12 per shirt
        int manufactureHoodie = 24; //$24 per hoodie
        
        int revenue = (shirtSold*shirtPrice)+(hoodieSold*hoodiePrice);
        double revenuePostShip = (revenue - (shirtSold*2.65) - (hoodieSold*7.40));
        double profit = (revenuePostShip - (shirtSold*manufactureShirt) - (hoodieSold*manufactureHoodie));
        
        System.out.println("Revenue: $" + Math.round(revenue) + " | Minus Shipping: $" + Math.round(revenuePostShip));
        System.out.println("Profit: $" + Math.round(profit)); //rounded to nearest whole number
        
    }
    
}
