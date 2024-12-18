package lucasbarros.soundflow.modelos;

public class Preferidas {

    public void Inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getNome() + " é considerado um hit.");
        } else {
            System.out.println(audio.getNome() + " é uma boa pedida!");
        }
    }

}
