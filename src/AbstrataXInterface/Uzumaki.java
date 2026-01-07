package AbstrataXInterface;

public class Uzumaki extends Ninja{

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void NomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }
}
