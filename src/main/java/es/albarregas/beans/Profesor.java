package es.albarregas.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/*
* Anotación estándar JPA, aplicada a la clase. Indica que esta clase Java es una entidad a persistir
*/
@Entity
/*
* Nombre de la tabla de la BD, opcional si tiene el mismo nombre que el bean
*/ 
@Table(name = "profesoresAnot")
@DynamicUpdate(true)
public class Profesor implements Serializable {
    /*
    * se aplica a un atributo Java e indica que este atributo es la clave primaria
    */
    @Id
    /*
        Permite crear un campo identificador en función de una estrategia. Se basa en el parámetro strategy mediante un 
        GenerationType, de valores:
            AUTO: viene a ser el equivalente a NATIVE
            IDENTITY: Hibernate se hará responsable de asignar la clave primaria en base a la columna identidad, 
            se corresponde con auto_increment de MySQL
    */
    @GeneratedValue(strategy = IDENTITY)
    /* 
        Se aplica a un atributo Java e indica el nombre de la columna de la BD en la que se persistirá el atributo.
        Opcional si el atributo y la columna de la BD se llaman igual
    */
    @Column(name = "idProf")
    private int id;
    
    /*
    * name - nombre de la columna de la tabla, length - longitud de caracteres en tipo String, nullable - crea una restricción not null
    */
    @Column(name = "nombre", length = 20, nullable = true)
    private String nombre;
    @Column(name = "ape1", length = 15, nullable = true)
    private String ape1;
    @Column(name = "ape2", length = 15, nullable = false)
    private String ape2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }
    
    
}
