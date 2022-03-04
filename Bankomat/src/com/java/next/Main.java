package com.java.next;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ps = 1999, lgn = 1111;
        int balans=1000000, balansusd=0, balansrubl=0,balanseuro=0;
        String history1="";

        System.out.println("Enter your full name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

      System.out.println("Enter Login");
        Scanner scan1 = new Scanner(System.in);
        int log = scan1.nextInt();
        System.out.println("Enter Password");
        int pass = scan1.nextInt();

        if (pass == ps && log == lgn) {

            System.out.println("Welcome: " + name + "\n");

           while (true) {
               System.out.println("Menu\n" + "----------------\n");

               System.out.println("1:Balans\n" + "2:Money Withdraw\n" + "3:Money Add\n" +
                       "4:Reset Password\n" + "5:Exchange\n" + "6:History\n" +"7:Payment");
               int op= scan1.nextInt();
               switch(op){
                   case 1:{
                       System.out.println("Which Balans:\n"+"1:UZS\n"+"2:USD\n"+"3:EURO\n"+"4:Ruble");
                       int op2= scan1.nextInt();
                       switch (op2) {
                           case 1:{System.out.println("Your UZS Balans: " + balans + " sum");
                           break;
                           }
                           case 2:{
                               System.out.println("Your USD Balans: " + balansusd + " $");
                                   break;
                           } case 3:{
                                   System.out.println("Your EURO Balans: " + balanseuro + " ruble");
                                       break;
                               }
                           case 4:{
                               System.out.println("Your Ruble Blans: " + balansrubl + " Euro");
                               break;
                           }
                       } break;
                   }
                   case 2:{
                       System.out.println("Enter how much money you want to withdraw:");
                       int withd= scan1.nextInt();
                       if(withd<=balans){
                           System.out.println("Operation done:");
                            balans= balans-withd;
                           System.out.println("Your Current Balans is " + balans + " sum");
                           history1=history1 + "From your balans " + withd +" uzs withdrawed from your UZS balans\n";
                       }else {
                           System.out.println("Your balans does nat have that amount!!");
                       }
                       break;
                   }
                   case 3:{
                       System.out.println("Enter an amount you want to add to your balans:");
                       int addb= scan1.nextInt();
                       balans+=addb;
                       history1=history1 + addb +" uzs Added to your UZS balans\n";
                       System.out.println("Operation dane:\n" + "Your Current balans is: " + balans +" sum");
                       break;
                   }
                   case 4:{
                       System.out.println("To reset your password pls confirm your old password:");
                       int oldp= scan1.nextInt();
                       if (oldp==pass){
                           System.out.println("Enter a new password");
                           int newp= scan1.nextInt();
                           history1=history1+"Your old pasword:" +pass + " changed to: "+ newp+"\n";
                           newp=pass;

                       }else {
                           System.out.println("Password is incorrect!!");
                       }
                       break;
                   }
                   case 5:{
                       System.out.println("Choose an operation from menu:");
                       System.out.println("1: UZS->USD\n" +"2:UZS->RUBL\n" + "3:UZS->EURO");
                       int op1= scan1.nextInt();
                       switch (op1){
                           case 1:{
                               System.out.println("1$=10,885.00 Uzbekistani Som");
                               System.out.println("Enter an UZS amount to convert");
                               int usd= scan1.nextInt();
                               balans-=usd;
                               history1=history1+"You converted "+usd + " uzs to usd and it added to your USD balans\n";
                                usd/=10885.00;
                               balansusd+=usd;

                               System.out.println("Operation done"+"Your USD balans has "+ balansusd+" $");
                               break;
                           }
                           case 2:{
                               System.out.println("1r=99.00 Uzbekistan Som");
                               System.out.println("Enter an UZS amount to convert");
                               int rubl= scan1.nextInt();
                               history1=history1+"You converted "+rubl + " uzs to ruble and it added to your RUBLE balans\n";
                               balans-=rubl;
                               rubl/=99.00;

                               balansrubl+=rubl;
                               System.out.println("Operation done"+"Your USD balans has "+ balansrubl+" RUBLE");
                               break;
                           }
                           case 3:{
                               System.out.println("1E=12,042.79 Uzbekistan Som");
                               System.out.println("Enter an UZS amount to convert");
                               int euro= scan1.nextInt();
                               history1=history1+"You converted "+euro + " uzs to euro and it added to your EURO balans\n";
                               balans-=euro;
                               euro/=12042.00;

                               balanseuro+=euro;
                               System.out.println("Operation done"+"Your USD balans has "+ balanseuro+" EURO");
                               break;
                           }
                       }
                       break;
                   }
                   case 6:{
                       System.out.print(history1);
                       break;
                   }
                   case 7:{
                       System.out.println("Enter your mobile num:");
                       System.out.println("Enter a value:");
                       int num= scan1.nextInt();
                       int vl= scan1.nextInt();
                       System.out.println("Operation done:");
                       history1=history1+vl+" uzs sent to "+num+"\n";
                       balans-=vl;
                   }
               }
           }
        }else {
            System.out.println("Pass or Log incorrect Try again!");

        }

    }
}


