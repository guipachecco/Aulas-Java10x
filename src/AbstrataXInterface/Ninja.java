package AbstrataXInterface;

public abstract class Ninja implements EstrategiadeBatalha{

    String nome;
    String aldeia;
    int idade;

    // Metodos Abstratos
    public abstract void NomeDoNinja();

    public void TacarKunai() {
        System.out.println("O ninja " + nome + " tacou uma kunai");
    }

    //Sobreescrevendo o metodo da interface
    @Override
     public void EstrategiadeBatalhaNinja() {
         System.out.println( "Meu nome é: " +nome +" Essa é minha estrategia de batalha");
     }

}