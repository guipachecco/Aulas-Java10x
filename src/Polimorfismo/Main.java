package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        // objeto 1
        Diaz Miguel = new Diaz();
        Miguel.nome = "Miguel Diaz";
        Miguel.idade = 18;
        Miguel.Cidade = "Nova Jersey";
        Miguel.habilidadeEspecial();

        // objeto 2
        Larusso Samantha = new Larusso();
        Samantha.idade = 18;
        Samantha.nome = "Samantha Larusso";
        Samantha.Cidade = "Nova Jersey";
        Samantha.habilidadeEspecial();
    }
}
