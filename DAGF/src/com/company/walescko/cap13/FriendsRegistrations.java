package com.company.walescko.cap13;

import java.io.Console;
import java.util.Scanner;

class FriendsData{
    protected String name;
    protected String city;
    protected String sex;
}

public class FriendsRegistrations {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 10;

        FriendsData[] friends = new FriendsData[n];
        FriendsData friend = new FriendsData();

        System.out.println("\nCadastro de Amigos");
        int contadorCadastro;

        for(contadorCadastro = 0; contadorCadastro < n; contadorCadastro++){
            friend = new FriendsData();
            System.out.print("Qual o nome a cadastrar? ");
            friend.name = scan.nextLine();
            System.out.print("Qual o nome a cadastrar? ");
            friend.city = scan.nextLine();
            System.out.print("Qual o genêro? ");
            friend.sex = scan.nextLine();

            friends[contadorCadastro] = friend;

            System.out.print("\nDigite n para encerrar.\nPara continuar digite s. ");
            String continu = scan.nextLine();
            if(continu.equalsIgnoreCase("n")){
                break;
            }
        }

        System.out.printf("\nQuantidade de amigos cadastrados: %s", contadorCadastro + 1);

        for(int i = 0; i <= contadorCadastro; i++){
            System.out.printf("\nNome: %s %s", i, friends[i].name);
            System.out.printf("\nCidade: %s", friends[i].city);
            System.out.printf("\nGenêro: %s", friends[i].sex);
        }
    }
}
