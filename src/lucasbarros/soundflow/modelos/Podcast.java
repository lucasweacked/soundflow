package lucasbarros.soundflow.modelos;

public class Podcast extends Audio {

    private String descricacao;
    private String host;

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 10) {
            return 10;
        } else {
            return 8;
        }
    }
}
