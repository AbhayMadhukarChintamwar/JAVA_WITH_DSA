package If_Else;

import  java.util.Scanner;
public class ProfitOrLoss {
    static void main(String[] args) {
        /* if cost price and celling price of an item is input through the keyword, write a program to determine whether the
        seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss he incurred. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a cost price");
        double costPrice = sc.nextDouble();
        System.out.println("Enter a selling price");
        double sellingPrice = sc.nextDouble();


      double  ProfitOrLos  = sellingPrice /costPrice * 100;

      if (ProfitOrLos > 100){
         double profit = ProfitOrLos -100;
          System.out.println("The total profit  to the seller has : "+  profit +"%"  + " and RS: "+ (sellingPrice-costPrice) + " profit");
      }else if(ProfitOrLos<100) {
          double loss = 100 - ProfitOrLos;
          System.out.println("The total loss to the seller has  : "+ loss +"%" + " and RS: "+ (costPrice - sellingPrice) + " loss");
      }else {
          System.out.println("seller has incurred no profit  or no loss");
      }




    }
}
