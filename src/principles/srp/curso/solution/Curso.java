package principles.srp.curso.solution;

public class Curso {
    private int codigo;
    private String nombre;
    private int creaditos;
    private int horasTeoricas;
    private int horasPracticas;
    private String idioma;
    private Sede sede;

    public Curso(int codigo, String nombre, int creaditos, int horasTeoricas, int horasPracticas, String idioma, Sede sede) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creaditos = creaditos;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.idioma = idioma;
        this.sede = sede;
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

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

   

}
