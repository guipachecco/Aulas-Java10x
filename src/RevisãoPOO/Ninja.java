package RevisãoPOO;

public class Ninja {
    String name;
    int age;
    String village;

    public void SocouACara(){
        System.out.println("O ninja socou a cara de outra pessoa");
    }
    public void ChutouaCara(){
        System.out.println("O ninja chutou a cara de outa pessoa");
    }
    public String EuSouUmNinja () {
        return "Olá, eu sou um Ninja!";
    }
    public  int AnosParaSerNinja(int idadeMinimaParaSerNinja ) {
        return idadeMinimaParaSerNinja - age;
    }

}
