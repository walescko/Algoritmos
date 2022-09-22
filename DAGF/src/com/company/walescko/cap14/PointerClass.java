package com.company.walescko.cap14;

import java.lang.ref.Reference;

public class PointerClass {

//    public class Referencia {
        String contex;


    public static void main(String[] args){

        PointerClass refA = new PointerClass();
        refA.contex = "referencia A";

        PointerClass refB = new PointerClass();
        refB.contex = "referencia B";

        System.out.printf("valor da variável refA é %s; e o valor da variável refB é %s\n", refA.contex, refB.contex);

        refA.recebeValores(refB, refA);

        System.out.printf("valor da variável refA é %s; e o valor da variável refB é %s\n", refA.contex, refB.contex);


    }

    public void recebeValores(PointerClass refA, PointerClass refB){
        refA.contex = refB.contex;
    }
}
