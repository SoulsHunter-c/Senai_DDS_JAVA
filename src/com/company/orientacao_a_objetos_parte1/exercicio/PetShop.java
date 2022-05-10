package com.company.orientacao_a_objetos_parte1.exercicio;
/*
instanciando e acessando atributos do objeto
Utilizando o Eclipse, vamos fazer este primeiro exercícios sobre Orientação a Objetos. Fique a vontade para criar outro projeto ou utilizar um existente.
Um pet shop te chamou para ajudar no controle dos animais que eles cuidam. Eles irão precisar de muitos serviços, o primeiro é mapear qual o nome, raça, sexo (macho ou fêmea) e idade.
1. Crie uma classe chamada "Cachorro" e adicione os atributos para nome, raça, sexo e idade.
2. Crie uma outra classe chamada "PetShop" para testarmos nossa classe "Cachorro". Adicione o método "main".
3. Agora vamos instanciar um objeto do tipo "Cachorro". Dentro do método "main" utilize a palavra-chave "new" para criar o objeto.
4. Agora que temos um objeto do tipo "Cachorro", vamos definir os atributos dele.
5. Para mostrar na saída os valores deste objeto, vamos utilizar o código abaixo.
6. Execute o programa e veja o resultado na saída do console. Arrisque um pouco, crie outro objeto do tipo "Cachorro" e tente perceber que são objetos diferentes criados a partir de uma única classe.
 */
public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bethoven");
        cachorro.setIdade(7);
        cachorro.setRaca("Poodle");
        cachorro.setSexo("Hominho");

        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Idade do cachorro: " + cachorro.getIdade());
        System.out.println("Raca do cachorro: " + cachorro.getRaca());
        System.out.println("Sexo do cachorro: " + cachorro.getSexo());
    }
}
