package com.company.Logica.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a letra referente ao seu sexo:\nF - Feminino\nM - Masculino");
        char sexoInformado = scanner.next().charAt(0);
        boolean sexoMasculino = sexoInformado == 'm'|| sexoInformado == 'M';
        boolean sexoFeminino = sexoInformado =='F' || sexoInformado=='f';
        if(sexoMasculino){
            System.out.println("O sexo informado foi masculino!");
        }else if(sexoFeminino){
            System.out.println("O sexo informado é feminino!");
        }else{
            System.out.println("Insira um sexo valido!");
        }
        scanner.close();
    }
}
