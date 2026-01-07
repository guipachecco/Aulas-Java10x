package AbstrataXInterface;

public class Main {
    public static void main(String[] args) {

        // obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.EstrategiadeBatalhaNinja();
        naruto.TacarKunai();
        naruto.NomeDoNinja();


        System.out.println("---------------------------------------------------");

        // obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.NomeDoNinja();
        sasuke.TacarKunai();
        sasuke.EstrategiadeBatalhaNinja();

    }
}
