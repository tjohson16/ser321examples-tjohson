import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         int numerator = 1;
         int denominator = 1;

         if (args.length > 0) {
            numerator = Integer.parseInt(args[0]);
         }
         if (args.length > 1) {
            denominator = Integer.parseInt(args[1]);
         }

         // create a new instance
         Fraction frac = new Fraction();

         // set the values
         frac.setNumerator(numerator);
         frac.setDenominator(denominator);

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      } catch (NumberFormatException e) {
         System.out.println("Both arguments must be integers.");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

