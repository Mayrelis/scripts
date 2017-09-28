/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeprinter;

import java.util.Scanner;

public class PrimePrinter {

   int current;

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.print("Enter the range: ");

      int maxInt = in.nextInt();

      // "maxInt" contains the number entered by the user.

      // Make a PrimeGenerator object, and write a loop

      // that uses the PrimeGenerator's nextPrime() method to

      // get primes. If the prime is less than or equal to "maxInt",

      // print it; otherwise, terminate the loop.

      PrimeGenerator generator = new PrimeGenerator();

      int i=2;

      int prime;

      System.out.println("Prime numbers are:");

      while(i<=maxInt){

      if(i==2)

         System.out.println(i+" ");

      else{

      prime=generator.nextPrime();

      if(prime<=maxInt)

          System.out.println(prime+" ");

      }

      i++;

      }

   }

   

}


