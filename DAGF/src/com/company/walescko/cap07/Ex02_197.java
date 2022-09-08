package com.company.walescko.cap07;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02_197 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        Obtendo a ano atual
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int yearActual = calendar.get(Calendar.YEAR);

        int yearMarriage, timeMarriage;

        System.out.println("Exercício 02 - página 197");
        System.out.println("Tempo de casamento");
        System.out.println("Qual o ano da casamento? ");
        yearMarriage = scan.nextInt();


        timeMarriage = yearActual - yearMarriage;


        switch (timeMarriage) {
            case 25:
                System.out.printf("Bodas de prata! %s anos de casados", timeMarriage);
                break;
            case 50:
                System.out.printf("Bodas de Ouro! %s anos de casados", timeMarriage);
                break;
            case 75:
                System.out.printf("Bodas de Diamante! %s anos de casados", timeMarriage);
                break;
            default:
                System.out.printf("São %s anos de casados!", timeMarriage);
        }
    }
}


