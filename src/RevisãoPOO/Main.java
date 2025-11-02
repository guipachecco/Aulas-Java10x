package RevisãoPOO;

public class Main {
    public static void main(String[] args) {

        // criando objeto
        Ninja Sneaky_Ninja = new Ninja();

        Sneaky_Ninja.name = "Jackie Chan";
        Sneaky_Ninja.age = 58;
        Sneaky_Ninja.village = "Hong Kong";
      // criando metodos
        Sneaky_Ninja.SocouACara();
        Sneaky_Ninja.EuSouUmNinja();

        //chamando metódos
        String ChamandoMetodo = Sneaky_Ninja.EuSouUmNinja();
        System.out.println(ChamandoMetodo);

        int tempo_restante = Sneaky_Ninja.AnosParaSerNinja(60);
        System.out.println("Você tem " + Sneaky_Ninja.age + " anos então faltam no minímo " + tempo_restante + " anos para se tornar ninja");

        // criando outro objeto

        Ninja Traitor_Ninja = new Ninja();
        Traitor_Ninja.name = "Bruce Lee";
        Traitor_Ninja.age = 108;
        Traitor_Ninja.village = "Boston";
        Traitor_Ninja.ChutouaCara();
        Traitor_Ninja.EuSouUmNinja();
    }
}
