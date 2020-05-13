package patrones.adapter.ejemplo1;

// Clase Client
public class Cliente {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayerImpl();
        audioPlayer.play("festejo.mp3");
        audioPlayer.pause();
        audioPlayer.stop();
    }
    
}
