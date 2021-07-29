package com.company;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice=0;

        System.out.println("Armut Kaç kilo ? : ");
        double armut = input.nextInt();
        totalPrice+= armut*2.14;

        System.out.println("Elma Kaç kilo ? : ");
        double elma = input.nextDouble();
        totalPrice+= elma*3.67;

        System.out.println("Domates Kaç kilo ? : ");
        double domates = input.nextDouble();
        totalPrice+= domates*1.11;

        System.out.println("Muz Kaç kilo ? : ");
        double muz = input.nextDouble();
        totalPrice+= muz*0.95;

        System.out.println("Patlıcan Kaç kilo ? : ");
        double patlican = input.nextDouble();
        totalPrice+= patlican*5.00;

        System.out.println("Toplam Tutar : "+totalPrice+ " TL" );

    }
}