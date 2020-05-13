package patrones.adapter.ejemplo1;

// Target
public interface AudioPlayer {
    public void play(String file);
    public void pause();
    public void stop();
}
