/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cara_coroa;

/**
 *
 * @author C
 */

import java.util.Scanner;
import java.util.Random;
     
public class Cara_Coroa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Random random = new Random();
        
        System.out.println("\t\t        |-----------------------------|");
        System.out.println("\t\t        |    JOGO DO CARA OU COROA    |");
        System.out.println("\t\t        |-----------------------------|");
    
        //int cara = 0;
        //int coroa = 1;
        int pontosJogador=0;
        int pontosComputador=0;
        
        System.out.print("\nPor quantas rodadas deseja jogar?: ");
        int quantidadeRodadas = entrada.nextInt();
        
        
        //rodando o jogo
        for(int i=0; i<quantidadeRodadas; i++){
            System.out.println("|- - - - - - - - - - - Digite o numero do seu palpite"
                    + " - - - - - - - - - - -|\nCARA = 0\nCOROA = 1");
            
            System.out.print("PALPITE: ");
            int palpite = entrada.nextInt();
            
            //caso o usuario digite um numero diferente de 0 ou 1
            if (palpite != 0 && palpite!= 1){
                System.out.println("|- - - - - - - - - - - - - - - - - - - -|");
                System.out.println("Opcao Invalida!");
                System.out.print("Por favor,tente novamente, 0 ou 1: ");
                palpite = entrada.nextInt();
                System.out.println("\n|- - - - - - - - - - - - - - - - - - - -|");
            //usuario digitando 0 ou 1
            } if(palpite == 0 || palpite == 1) {
                int numeroSorteado = random.nextInt(2); //numero aletorio de 0 a 1
                System.out.println("\n\t\t\t\tNumero sorteado: " + numeroSorteado);
            
                if(numeroSorteado == palpite){
                    System.out.println("\t\t\t|----------------------------------|");
                    System.out.println("\t\t\t\tPARABENS! VOCE ACERTOU");
                    System.out.println("\t\t\t|----------------------------------|");
                    pontosJogador++;
                } else if (numeroSorteado != palpite){
                    System.out.println("\t\t\t|----------------------------|");
                    System.out.println("\t\t\t\t VOCE ERROU!");
                    System.out.println("\t\t\t|----------------------------|");
                    pontosComputador++;
                }
            }
        }

        System.out.println("\n\n|- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        System.out.println("Pontos Jogador: " + pontosJogador);
        System.out.println("Pontos Computador: " + pontosComputador);
        
        //verifica e exibe o vencedor
        if (pontosJogador > pontosComputador){
                System.out.println("\t\t\t|-----------------------------------------|");
                System.out.println("\t\t\t\tPARABENS!! VOCE GANHOU O JOGO");
                System.out.println("\t\t\t|-----------------------------------------|\n\n");
            }else if (pontosComputador>pontosJogador){
                System.out.println("\t|-------------------------------------------------------------|");
                System.out.println("\t\tO COMPUTADOR GANHOU! MAIS SORTE DA PROXIMA VEZ");
                System.out.println("\t|-------------------------------------------------------------|\n\n");
            } else{
                System.out.println("\t\t|------------------------|");
                System.out.println("\t\t\tEMPATE");
                System.out.println("\t\t|------------------------|\n\n");
            }
    }
}
