package patrones.command.ejemplo1;
//RECEPTOR
// Es el receptor de las peticiones quien se encarga de tener toda la lógica
public class Pantalla {
    
    //Stringbuffer nos proporciona mejores funciones para manejar facilmente una cadena
   private StringBuffer texto; //texto de la pantalla
   private StringBuffer portaPapeles; 

    public Pantalla(String texto) {
        //Inicializando las variables al arrancar el programa
        this.texto = new StringBuffer(texto);
        this.portaPapeles = new StringBuffer(); // no es parámetro porque al inicio no existe valor
    }
   
    //LIMPIAR PORTAPAPELES
    public void limpiarPortapapeles(){
        //Borra todo el contenido del portapapeles de 0 hasta su longitud actual
        this.portaPapeles.delete(0, this.portaPapeles.length());
    }
    
    // GetPORTAPAPELES
    public String getPortapapeles(){
        //retorna el valor actual del portapapeles
        return this.portaPapeles.toString();
    }
    
    public void cortar(int inicio, int fin){
        limpiarPortapapeles(); //borra todo el contenido previo del portapapeles
        this.portaPapeles.append(this.texto.substring(inicio, fin)); //agrega al portapapeles el contenido seleccionado de acuerdo al parámetro inicio y fin
        this.texto.delete(inicio, fin); //CORTA el mismo texto que ingresó al portapeles que se visualiza en la pantalla
    }
    
    public void copiar (int inicio, int fin){
        limpiarPortapapeles(); //borra todo el contenido previo
        this.portaPapeles.append(this.texto.substring(inicio, fin)); //agrega al portapapeles el contenido a copiar
        
    }
   
    public void pegar (int posicion){
        //Esta funcion pega, en la posición indicada por el parámetro, lo que se encuentra en el portapapeles
        // INSERT (posicion de inicio del pegado, texto a pegar)
        this.texto.insert(posicion,getPortapapeles());
    }
    
    public void setTexto (String texto){
        //Establece un nuevo valor al texto que aparece en la pantalla
        this.texto = new StringBuffer(texto);
    }
    
   @Override
    public String toString(){
        return this.texto.toString(); //sobreescribe la funcion toString para permitirme castear el valor de mi clase
    }
   
   
}
