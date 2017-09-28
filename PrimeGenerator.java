/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeprinter;

/**
 *
 * @author mayrelismorejon
 */
public class PrimeGenerator {
    
int current;

    /**

     Initialize the PrimeGenerator object with the first number.*/

   public PrimeGenerator()

   {

      current = 1;

   }

/**

      Calculate the next prime number after current.

      @return the next prime number */

   public int nextPrime()

   {

      current++; // Increment past previous prime number.

    

      // Write a loop that uses the value of the variable current,

    // and while isPrime(current) is false, increment current.

      // (When the loop exits, current contains the next prime number,

      // which we can return.)

       while(!isPrime(current))

       {

         current++;

       }

      return current;

   }

   /**

      Determine whether the given number is prime.

      @param n Number to check

      @return true if prime, or false if not

   */

   public static boolean isPrime(int n)

   {

      // Write "if" comparisons and a loop to determine whether

      // "n" is prime. We'll work this method out in class.

       boolean flag=false;

       int count=1;

           for(int j=3;j<=n;j++)

           {

               if(n%j==0)

                   count++;

           }

       if(count==2)

           flag=true;

       return flag;

   }

}


