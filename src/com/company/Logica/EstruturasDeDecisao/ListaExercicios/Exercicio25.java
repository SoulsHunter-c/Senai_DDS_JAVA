package com.company.Logica.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio25 {
    private static final byte REU_INOCENTE = 0;
    private static final byte REU_SUSPEIRO = 2;
    private static final byte REU_CUMPLICE = 4;
    private static final byte REU_ASSASINO = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?[1-SIM || 0-NÃO]");
        int telefonouParaVitima = scanner.nextInt();
        System.out.println("Esteve no local do crime?[1-SIM || 0-NÃO]");
        int esteveNoLocalDoCrime = scanner.nextInt();
        System.out.println("Mora perto da vitima?[1-SIM || 0-NÃO]");
        int moraPertoDaVitima = scanner.nextInt();
        System.out.println("Devia para a vitima?[1-SIM || 0-NÃO]");
        int deviaParaVitima = scanner.nextInt();
        System.out.println("Já trabalhou com a vitima?[1-SIM || 0-NÃO]");
        int jaTrabalhouComVitima = scanner.nextInt();
        int teste = verificaPontosDeSuspeita(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParaVitima,jaTrabalhouComVitima);
        if(verificaSeSuspeito(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParaVitima,jaTrabalhouComVitima)){
            System.out.println("Obrigado por responder, devido as respostas voce foi classificado como:\nSUSPEITO");
        }else if(verificaSeCumplice(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParaVitima,jaTrabalhouComVitima)){
            System.out.println("Obrigado por responder, devido as respostas voce foi classificado como:\nCUMPLICE");
        }else if(verificaSeAssasino(telefonouParaVitima, esteveNoLocalDoCrime, moraPertoDaVitima, deviaParaVitima,jaTrabalhouComVitima)){
            System.out.println("Obrigado por responder, devido as respostas voce foi classificado como:\nASSASINO");
        }else{
            System.out.println("Obrigado por responder, devido as respostas voce foi classificado como:\nINOCENTE");
        }
        System.out.println(teste);
    }
    private static int verificaPontosDeSuspeita(int telefonouParaVitima , int esteveNoLocalDoCrime , int moraPertoDaVitima , int deviaParavitima , int jaTrabalhoComVitima){
        return telefonouParaVitima + esteveNoLocalDoCrime + moraPertoDaVitima + deviaParavitima + jaTrabalhoComVitima;
    }
    private static boolean verificaSeSuspeito(int telefonouParaVitima , int esteveNoLocalDoCrime , int moraPertoDaVitima , int deviaParavitima , int jaTrabalhoComVitima){
        return verificaPontosDeSuspeita(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParavitima,jaTrabalhoComVitima) == REU_SUSPEIRO ;
    }

    private static boolean verificaSeCumplice(int telefonouParaVitima , int esteveNoLocalDoCrime , int moraPertoDaVitima , int deviaParavitima , int jaTrabalhoComVitima){
        return verificaPontosDeSuspeita(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParavitima,jaTrabalhoComVitima) == REU_CUMPLICE;
    }

    private static boolean verificaSeAssasino(int telefonouParaVitima , int esteveNoLocalDoCrime , int moraPertoDaVitima , int deviaParavitima , int jaTrabalhoComVitima){
        return verificaPontosDeSuspeita(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParavitima,jaTrabalhoComVitima) == REU_ASSASINO;
    }
    private static boolean verificaSeInocente(int telefonouParaVitima , int esteveNoLocalDoCrime , int moraPertoDaVitima , int deviaParavitima , int jaTrabalhoComVitima){
        return verificaPontosDeSuspeita(telefonouParaVitima,esteveNoLocalDoCrime,moraPertoDaVitima,deviaParavitima,jaTrabalhoComVitima) == REU_INOCENTE;
    }
}
