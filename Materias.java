import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Materias {

    private String nombreMateria;
    private String codigoMateria;
    private List<String> alumnos = new ArrayList<>();

    /**
     * Constructor para definir directamente el nombre y codigo de la materia
     * 
     * @param nombreMateria recive un string con el nombre de la materia
     * @param codigoMateria recive un string con el codigo de la materia
     * @param alumnos recive una lista con los alumnos de dicha materia
     */
    public Materias(String nombreMateria, String codigoMateria, List alumnos) {
        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
        this.alumnos = alumnos;
    }

    /**
     * Constructor vacio para poder crear un objeto materia sin llenar directamente
     * los datos
     */
    public Materias() {
    }

    /*
     * Getters y setters para acceder a las propiedades de el objeto materia
     */
    public String getNombremateria() {
        return this.nombreMateria;
    }

    public void setNombremateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigomateria() {
        return this.codigoMateria;
    }

    public void setCodigomateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public List<String> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(List<String> alumnos) {
        this.alumnos = alumnos;
    }

    /*
     * Metodos propios de el objeto para su funcionabilidad
     */
    public void setNuevoAlumno(String alumno) {
       try {
        this.alumnos.add(alumno);
       } catch (Exception e) {
           System.out.println("Exception: "+e.getMessage());
       }
    }
}