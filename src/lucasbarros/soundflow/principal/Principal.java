package lucasbarros.soundflow.principal;

import lucasbarros.soundflow.modelos.Musica;
import lucasbarros.soundflow.modelos.Podcast;
import lucasbarros.soundflow.modelos.Preferidas;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Random random = new Random();

        Musica musica = new Musica();
        musica.setArtista("Red Hot Chili Peppers");
        musica.setNome("Eddie");
        musica.setAlbum("Return of the Dream Canteen");
        musica.setGenero("Rock");

        int reproducoesMusica = random.nextInt(23);
        int curtidasMusica = random.nextInt(32);

        for (int i = 0; i < reproducoesMusica; i++) {
            musica.Reproduz();
        }

        for (int i = 0; i < curtidasMusica; i++) {
            musica.Curtir();
        }

        System.out.println("   ");
        System.out.println("Música: " + musica.getNome());
        System.out.println("Reproduções: " + musica.getTotalReproducoes());
        System.out.println("Curtidas: " + musica.getTotalCurtidas());
        System.out.println("Classificação: " + musica.getClassificacao());
        System.out.println("   ");

        Podcast podcast = new Podcast();
        podcast.setNome("PeeWee Cast");
        podcast.setHost("Miguel e Leo");

        int reproducoesPodcast = random.nextInt(23);
        int curtidasPodcast = random.nextInt(32);

        for (int i = 0; i < reproducoesPodcast; i++) {
            podcast.Reproduz();
        }

        for (int i = 0; i < curtidasPodcast; i++) {
            podcast.Curtir();
        }

        System.out.println("   ");
        System.out.println("Podcast: " + podcast.getNome());
        System.out.println("Reproduções: " + podcast.getTotalReproducoes());
        System.out.println("Curtidas: " + podcast.getTotalCurtidas());
        System.out.println("Classificação: " + podcast.getClassificacao());
        System.out.println("   ");

        Preferidas preferidas = new Preferidas();
        preferidas.Inclui(musica);
        preferidas.Inclui(podcast);
    }
}
