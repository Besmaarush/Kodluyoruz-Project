package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        getData();
    }

    public static void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsminiz girin: ");
        String name = scanner.next();
        System.out.print("Soyisminiz girin: ");
        String surname = scanner.next();
        System.out.print("Vize notunu girin: ");
        int midterm = scanner.nextInt();
        System.out.print("Final notunu girin: ");
        int finalExam = scanner.nextInt();
        run(name, surname, midterm, finalExam);
    }

    private static void run(String name, String surname, int midterm, int finalExam) {
        double average = calculateGrade(midterm, finalExam);
        String letterGrade = calculateLetterGrade(average);
        System.out.println(name + " vize " + midterm + " final " + finalExam +
                " dönem ortalaması " + average + " harf notu " + letterGrade);
    }

    private static double calculateGrade(int midterm, int finalExam) {
        return (midterm*0.4 + finalExam*0.6);
    }

    private static String calculateLetterGrade(double average) {
        String letterGrade;
        if(average <= 20){
            letterGrade = "FF";
        }else if(average <= 50){
            letterGrade = "CB";
        }else if(average <= 70){
            letterGrade = "BB";
        }else{
            letterGrade = "AA";
        }
        return letterGrade;
    }
}