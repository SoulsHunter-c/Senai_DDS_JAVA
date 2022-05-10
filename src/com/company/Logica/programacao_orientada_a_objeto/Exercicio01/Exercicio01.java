package com.company.Logica.programacao_orientada_a_objeto.Exercicio01;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        recebeQuantidadeEmEstoque(produto,scanner);
        boolean precisaReabastecerEstoque = produto.quantidadeEmEstoque <= 10;
        while(precisaReabastecerEstoque){
            System.err.println("É NECESSARIO REABASTECER O ESTOQUE, PRODUTOS EM ESTOQUE: " + produto.quantidadeEmEstoque);
            recebeQuantidadeEmEstoque(produto,scanner);
            precisaReabastecerEstoque = produto.quantidadeEmEstoque <= produto.QUANTIDADE_MINIMA_NO_ESTOQUE;
        }
    }
    public static void recebeQuantidadeEmEstoque(Produto produto, Scanner scanner){
        System.out.println("Qual a quantidade em estoque: ");
        produto.quantidadeEmEstoque = scanner.nextInt();
    }
}
