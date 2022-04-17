package com.company.EstrturaDeRepeticao;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cadastroInexistenteOuErro = true;
        while (cadastroInexistenteOuErro) {
            System.out.print("Informe o usuario: ");
            String usuario = scanner.next();
            System.out.print("Informe a senha: ");
            String senha = scanner.next();
            boolean senhaNaoEValida = Objects.equals(usuario, senha);
            if(senhaNaoEValida){
                System.out.println("Por favor insira uma senha diferente do nome de usuario, reiniciando cadastro...");
            }else{
                System.out.println("USUARIO: " + usuario + "\nSENHA: " + senha);
                cadastroInexistenteOuErro = false;
            }
            scanner.close();
        }
    }
}
