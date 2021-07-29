package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        int grade;
        String letterGrade;
        Random random = new Random();
        grade = random.nextInt(101);
        System.out.println("Puan: " + grade);
        if(grade <= 49){
            letterGrade = "FF";
        } else if(grade <= 54){
            letterGrade = "FD";
        } else if(grade <= 59){
            letterGrade = "DD";
        } else if(grade <= 64){
            letterGrade = "DC";
        } else if(grade <= 74){
            letterGrade = "CC";
        } else if(grade <= 79){
            letterGrade = "CB";
        } else if (grade <= 84){
            letterGrade = "BB";
        } else if(grade <= 89){
            letterGrade = "BA";
        } else{
            letterGrade = "AA";
        }
        System.out.println("Harf notunuz: " + letterGrade);
    }
}