import java.util.ArrayList;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Materias {

    private String nombreMateria;
    private String codigoMateria;
    private List<Double> notas = new ArrayList<>();

    /**
     * Constructor para definir directamente el nombre y codigo de la materia
     * 
     * @param nombreMateria recive un string con el nombre de la materia
     * @param codigoMateria recive un string con el codigo de la materia
     */
    public Materias(String nombreMateria, String codigoMateria) {
        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
    }

    /**
     * Constructor vacio para poder crear un objeto materia sin llenar directamente
     * los datos
     */
    public Materias() {
    }

    /*
     *Getters y setters para acceder a las propiedades de el objeto materia
     */
    public String getNombremateria() {
        return this.nombreMateria;
    }

    public void setNombremateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public List<Double> getNotas() {
        return this.notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

}