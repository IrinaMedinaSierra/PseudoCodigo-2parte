import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * clase Film
 * atributo entero id
 * atributo String nombrePelicula
 * atributo String director
 * atributo String reparto
 * atributo int anioProduccion
 * atributo String genero
 *
 * Constructor (atributos)
 *
 *
 * Metodos
 *
 *
 *
 *
 */


public class Film {
    private String nombrePelicula;
    private String director;
    private LocalDate anioProduccion;
    private static int id=0;
    private String reparto;
    private String genero;
    private int idPelicula;

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Film(String nombrePelicula, String director, String anioProduccion, String reparto, String genero) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.anioProduccion = LocalDate.parse(anioProduccion);
        this.reparto = reparto;
        this.genero = genero;
        this.idPelicula=++id; //se le asigna el id que incrementa la clase....
    }

    //Metodos Getter-> conseguir(leer)   y Setter-> colocar(insertar)..


    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getAnioProduccion() {

        return anioProduccion;
    }

    public void setAnioProduccion(LocalDate anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdPelicula() {

        return idPelicula;
    }

    @Override
    public String toString() {
        return " ID Pelicula=" + idPelicula +
                " Nombre Pelicula=" + nombrePelicula +
                " Director='" + director +
                " Año Produccion=" + anioProduccion.format(formato) +
                " Reparto='" + reparto +
                " Genero='" + genero ;
    }
}
