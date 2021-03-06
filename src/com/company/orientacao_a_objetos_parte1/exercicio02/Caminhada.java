package com.company.orientacao_a_objetos_parte1.exercicio02;

/*
composição de objetos e chamada de métodos
Vamos aproveitar a ideia do último exercício e aprender um pouco mais.
Imagine agora que você precise criar um programa para fazer uma pessoa caminhar com seu cãozinho. Nesta versão, cada pessoa pode ter apenas um animal, pois ainda não aprendemos outras estruturas de dados que permitem armazenar listas de objetos.
1. Crie a classe "Pessoa" e adicione um atributo do tipo "Cachorro". Assim estamos dizendo que uma "Pessoa" tem um "Cachorro" (essa classe é a mesma dos últimos exercícios).
2. Vamos criar uma classe chamada de "Caminhada" com um método "andar" que recebe como parametro um ojbeto do tipo "Pessoa". Dentro desse método, iremos simplesmente dizer os nomes da pessoa e do cachorro que estariam caminhado.
3. Agora podemos criar o passeio. Para isso crie uma nova classe chamada "Passeio" e adicione o método "main", agora podemos pensar na lógica de instanciar os objetos e chamar os métodos apropriados.
4. Compile e execute a classe Passeio, você deverá ver no console o nome da pessoa e do cachorro que estão passeando.
 */
public class Caminhada {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Claudia";
        pessoa.idade = 99;
        pessoa.cachorro = new Cachorro();
        pessoa.cachorro.nome = "Jose";
        pessoa.cachorro.raca = "Poodle";
        andar(pessoa);
    }
    private static void andar (Pessoa pessoa){
        System.out.println("A pessoa que esta passenado é: " + pessoa.nome + "\n" + "O cachorro com que esta pessoa esta passeando é: " + pessoa.cachorro.nome);
    }
}
