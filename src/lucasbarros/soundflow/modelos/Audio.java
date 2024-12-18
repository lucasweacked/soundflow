package lucasbarros.soundflow.modelos;

public class Audio {

    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;
    private String nome;

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Curtir() {
        this.totalCurtidas++;
    }

    public void Reproduz() {
        this.totalReproducoes++;
    }
}
