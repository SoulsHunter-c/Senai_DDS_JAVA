package com.company.orientacao_a_objetos_parte2.sobrecarga_Exercicio;

import java.util.Scanner;

/*
Você trabalha em uma empresa especialista em máquinas de fazer café e sua equipe é a responsável por desenvolver uma classe para o novo modelo de cafeteiras que irão fabricar.
No modelo anterior das cafeteiras, os usuários podiam selecionar se era para ser adicionado açúcar ou não, mas a nova versão da Super Cafeteira Tabajaras Plus++ deve ser capaz de receber a quantidade (em gramas) de açúcar a ser colocada no café.
Mesmo com essa nova possibilidade, o usuário não será obrigado a informar quanto de açúcar deseja. Deve-se adicionar 10 gramas de açúcar por padrão caso nenhum valor seja informado.
1. Para começar, crie a classe "MaquinaCafe" com um atributo chamado "acucarDisponivel", que será útil para saber a quantidade de açúcar disponível na máquina. Se o açúcar acabar, a máquina só permitirá cafezinhos sem açúcar, certo?
2. Agora crie um método chamado "fazerCafe" na mesma classe. Esse método deve verificar se a quantidade de açúcar disponível na máquina é suficiente e, claro, fazer o café.
3. Como o usuário não será obrigado a informar a quantidade de açúcar a ser adicionado no café, crie outro método com o nome "fazerCafe", que não recebe nenhum parâmetro. Isso é uma sobrecarga de métodos! Veja como devem ficar os dois métodos que fazem cafés:
4. Você deve ter percebido que os códigos dos dois métodos ficaram bem parecidos, certo? Sem pânico! Vamos melhorar fazendo um método chamar outro, aproveitando toda a lógica. Substitua os dois métodos por:
5. Crie uma classe agora para testar a máquina de café, afinal de contas, você deve evitar entregar código-fonte com bugs. Crie uma nova classe chamada "TesteMaquinaCafe" que instancia uma "MaquinaCafe" e atribui a quantidade de açúcar disponível.
6. Chame os métodos "fazerCafe" com diferentes valores para testar o funcionamento da máquina. No exemplo abaixo, o terceiro café não será possível de ser feito, pois não haverá mais açúcar disponível na máquina.
Dica do professor: use o debugger do Eclipse e execute o exemplo passo a passo. Isso ajuda bastante a entender o funcionamento e fixar os conceitos.
 */
public class MaquinaCafe {
    protected static int quantidadeDeAcucarNaMaquina;
    private static final int quantidadeNexessariaParaFazer = 5;

    public static int getQuantidadeDeAcucarNaMaquina() {
        return quantidadeDeAcucarNaMaquina;
    }

    public static void setQuantidadeDeAcucarNaMaquina(int quantidadeDeAcucarNaMaquina) {
        MaquinaCafe.quantidadeDeAcucarNaMaquina = quantidadeDeAcucarNaMaquina;
    }
    public void fazerCafe(Scanner scanner){
        System.out.println("Quanto de açucar voce deseja no cafe em gramas: ");
        int quantidadeDeAcucar = scanner.nextInt();
        if(quantidadeDeAcucar > getQuantidadeDeAcucarNaMaquina()){
            while (quantidadeDeAcucar > getQuantidadeDeAcucarNaMaquina()){
                System.err.println("A maquina nao possui essa quantidade de cafe, informe uma quantidade valida: (" + quantidadeDeAcucarNaMaquina + ")-AÇUCAR_NA_MAQUINA");
                quantidadeDeAcucar = scanner.nextInt();
            }
        }
        System.out.println("Fazendo cafe com: " + quantidadeDeAcucar + " gramas de açucar.");
        quantidadeDeAcucarNaMaquina = quantidadeDeAcucarNaMaquina - quantidadeDeAcucar;
    }
    public void fazerCafe(){
        System.out.println("Fazendo cafe com " + quantidadeNexessariaParaFazer + " gramas de açucar.");
    }
}
