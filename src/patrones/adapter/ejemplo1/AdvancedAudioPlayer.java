package patrones.adapter.ejemplo1;

// Adaptee
public class AdvancedAudioPlayer {
    public void readFile(String file){
        System.out.println("Leyendo archivo: "+file);
    }    
    public String verifyTypeFile(String file){
        String tipo = file.substring(file.indexOf("."));
        System.out.println("Tipo de archivo: "+tipo);
        return tipo;
    }
    public void playAudio(String file, String type){
        switch (type){
            case ".mp3":
                System.out.println("Reproduciendo MP3: "+file);
                break;
            case ".mp4":
                System.out.println("Reproduciendo MP4: "+file);
                break;
            default:
                System.out.println("Formato no soportado..");
                break;
        }
    }
}
