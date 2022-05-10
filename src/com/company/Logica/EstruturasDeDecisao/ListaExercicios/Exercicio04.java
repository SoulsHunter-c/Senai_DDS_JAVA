package com.company.Logica.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a letra para verificar: ");
        char letraInformada = scanner.next().charAt(0);
        if(verificaSeVogal(letraInformada)){
            System.out.println("A letra " + letraInformada + " informada é uma vogal!");
        }else{
            System.out.println("A letra " + letraInformada + " informada é uma consoante!");
        }
        scanner.close();
    }
    private static boolean verificaSeVogal(char letraInformada){
        return letraInformada == 'A' || letraInformada == 'a' || letraInformada == 'E' || letraInformada == 'e' || letraInformada == 'I' || letraInformada == 'i' || letraInformada == 'O' || letraInformada == 'o' || letraInformada == 'U' || letraInformada == 'u';
    }
}
