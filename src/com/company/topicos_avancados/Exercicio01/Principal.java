package com.company.topicos_avancados.Exercicio01;
/*
A Mega-Sena é o jogo que paga milhões de reais para o acertador dos números sorteados.
Em um jogo comum, os jogadores devem marcar 6 números entre os 60 disponíveis, sendo de 1 a 60.
Na empresa que você trabalha, o pessoal se juntou para fazer um bolão. Um bolão acontece quando várias pessoas se unem para jogarem várias combinações de números em conjunto. Se algum jogo for contemplado,
o valor do prêmio é dividido entre todos os participantes.
Como um bom programador, você sugeriu e se dispôs a desenvolver um pequeno software para gerar os números a serem marcados nos jogos. Todos concordaram, agora você tem um importante trabalho pela frente.
Faça um programa em Java que recebe como parâmetro do usuário a quantidade de jogos a serem feitos, gera e exibe na tela a sequência de números de cada jogo.
Use a classe Math para gerar números aleatórios e fazer arredondamentos. Lembre-se de verificar se não existem números repetidos em uma sequência, pois os 6 números devem ser únicos.
Se levar esse desafio a sério, jogar na Mega-Sena e ganhar, não esqueça de nós! ;)
 */
import java.lang.Math;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira quantos jogos deseja realizar: ");
        int jogosQueDesejaRealizar = scanner.nextInt();
        while(jogosQueDesejaRealizar > 5){
            System.out.println("Maximo de jogos é 5, deseja jogar quantas vezes? ");
            jogosQueDesejaRealizar = scanner.nextInt();
        }
        double[][] numeroDejogos = new double[jogosQueDesejaRealizar][6];
        for(int i=0; i < jogosQueDesejaRealizar; i++){
            for(int y=0; y<6; y++){
                double numeroParaJogar = Math.random() * 60;
                numeroParaJogar = Math.ceil(numeroParaJogar);
                while(numeroParaJogar < 1 || numeroParaJogar >= 60){
                    numeroParaJogar = Math.random();
                }
                if(numeroParaJogar == numeroDejogos[i][y]){
                    while(numeroParaJogar == numeroDejogos[i][y]){
                        numeroParaJogar = Math.random();
                        numeroParaJogar = Math.ceil(numeroParaJogar);
                        while(numeroParaJogar < 1 || numeroParaJogar >= 60){
                            numeroParaJogar = Math.random();
                        }
                    }
                }
                numeroDejogos[i][y] = numeroParaJogar;
            }
        }
        for(int i=0; i< jogosQueDesejaRealizar; i++){
            System.out.println("JOGO " + (i+1) + ":");
            for(int y=0; y<6; y++){
                System.out.println("NUMEROS PARA JOGAR: " + numeroDejogos[i][y]);
            }
            System.out.println("--------------------------------------");
        }
    }
}
