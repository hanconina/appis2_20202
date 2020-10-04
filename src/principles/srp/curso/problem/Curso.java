package principles.srp.curso.problem;

public class Curso {
    private int codigo;
    private String nombre;
    private int creaditos;
    private int horasTeoricas;
    private int horasPracticas;
    private String idioma;
    private String sede;
    private String direccionSede;
    private String paisSede;

    public Curso(int codigo, String nombre, int creaditos, int horasTeoricas, int horasPracticas, String idioma, String sede, String direccionSede, String paisSede) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creaditos = creaditos;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.idioma = idioma;
        this.sede = sede;
        this.direccionSede = direccionSede;
        this.paisSede = paisSede;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreaditos() {
        return creaditos;
    }

    public void setCreaditos(int creaditos) {
        this.creaditos = creaditos;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }
    


    void guardarCursoBD(Curso curso){
        System.out.println("El curso se guardo en la BD: "+curso.getNombre());
    }
    void eliminarCurso(int codigo){
        System.out.println("El curso con ID: "+codigo+" fue eliminado de la BD");
    }    
}
