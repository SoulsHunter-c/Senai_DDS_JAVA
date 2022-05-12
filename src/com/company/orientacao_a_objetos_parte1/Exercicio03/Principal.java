package com.company.orientacao_a_objetos_parte1.Exercicio03;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de produtos pra quarda no estoque: ");
        int quantosProdutosDeseja = scanner.nextInt();
        scanner.nextLine();
        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantosProdutosDeseja];
        for (int i = 0; i < estoque.produtos.length; i++) {
            estoque.produtos[i] = new Produto();
            System.out.println("Produto"+i);
            System.out.println("------------------------");
            System.out.println("Descrição:");
            estoque.produtos[i].descricao=scanner.next();
            scanner.nextLine();
            System.out.println("Quantidadedeitens:");
            estoque.produtos[i].quantidade=scanner.nextInt();
            System.out.println("Preco: ");
            estoque.produtos[i].preco = scanner.nextDouble();
        }
        estoque.listarProdutos();
        estoque.quantidadeTotalDeProdutosEmEstoque();
        }
    }