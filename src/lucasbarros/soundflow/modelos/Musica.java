package lucasbarros.soundflow.modelos;

public class Musica extends Audio {

    private String genero;
    private String artista;
    private String album;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 10) {
            return 10;
        } else {
            return 5;
        }
    }
}
