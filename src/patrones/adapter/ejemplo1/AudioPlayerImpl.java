package patrones.adapter.ejemplo1;

// Adapter
public class AudioPlayerImpl extends AdvancedAudioPlayer implements AudioPlayer{

    @Override
    public void play(String file) {
        // Modificaciones de nuevas funcionalidades
        // En el Adpater.
        super.readFile(file);
        String tipo = super.verifyTypeFile(file);
        super.playAudio(file, tipo);
    }

    @Override
    public void pause() {
        System.out.println("Pausando la reproducción");
    }

    @Override
    public void stop() {
        System.out.println("Deteminendo la reporducción");
    }
    
}
