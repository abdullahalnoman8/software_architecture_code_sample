package com.softwaredesignpatterns.observer_pattern;

public class Swap {

   public static int x=5 , y=6, temp=0 ;

   public static void main(String args[]){
      swapViaPlusMinus();
   }


   /* @ public no rm a l_ be ha v io r
   @ assignable x,y,temp;
   @ ensures x == \old(x)
   @ ensures y == \old(y)
   @ */
   public static void swapViaPlusMinus() {
      temp = x;
      x = y;
      y = temp;
      System.out.println("x = " + x + " Y = " + y);
   }

}
