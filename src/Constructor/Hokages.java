package Constructor;

public abstract class Hokages {
    String nome;
    int idade;
    Boolean vivoOuNao;
    String aldeia;
    int missoes;
    double SaldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages(String nome, int idade, Boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        SaldoBancario = saldoBancario;
        this.altura = altura;
    }

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoOuNao) {
       this.idade = idade;
       this.nome = nome;
       this.vivoOuNao = vivoOuNao;
    }

    public Hokages() {
    }
}


