package com.company.Logica.EstruturasDeDecisao.ListaExercicios;
import java.util.Scanner;
public class Exercicio05 {
    private static final int TOTAL_DE_NOTAS = 2;
    private static final int MEDIA_MINIMA_PARA_PASSAR = 7;
    private static final int MEDIA_PARA_APROVACAO_COM_DISTINCAO = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota parcial: ");
        double primeiraNotaParcial = scanner.nextDouble();
        System.out.print("Insira a segunda nota parcial: ");
        double segundaNoraParcial = scanner.nextDouble();
        double mediaDoAluno = calculaMedia(primeiraNotaParcial,segundaNoraParcial);
        if(verificaMediaMinima(mediaDoAluno)){
            System.out.println("Voce passou com media " + mediaDoAluno + ", parabens!!");
        }else if(verificaMediaComDistincao(mediaDoAluno) || mediaDoAluno > MEDIA_PARA_APROVACAO_COM_DISTINCAO){
            System.out.println("Voce foi aprovado com desntinção.");
        }else{
            System.out.println("Voce foi reprovado!!");
        }
        scanner.close();
    }
    private static double calculaMedia(double primeiraNotaParcial , double segundaNotaParcial){
        return (primeiraNotaParcial + segundaNotaParcial)/TOTAL_DE_NOTAS;
    }
    private static boolean verificaMediaMinima(double mediaDoAluno){
        return mediaDoAluno >= MEDIA_MINIMA_PARA_PASSAR && mediaDoAluno < MEDIA_PARA_APROVACAO_COM_DISTINCAO;
    }
    private static boolean verificaMediaComDistincao(double mediaDoAluno){
        return mediaDoAluno == MEDIA_PARA_APROVACAO_COM_DISTINCAO;
    }
}
