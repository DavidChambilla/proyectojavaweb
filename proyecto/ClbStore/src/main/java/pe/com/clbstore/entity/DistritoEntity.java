package pe.com.clbstore.entity;

import java.io.Serializable; 
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;
import lombok.AllArgsConstructor; 
import lombok.Builder; 
import lombok.Data; 
import lombok.NoArgsConstructor;

//@Builder te permite generar la construccion de la clase
@Builder
//@AllArgsConstructor te permite generar el metodo constructo con parametros
@AllArgsConstructor
//@NoArgsConstructor te permite generar el metodo constructor sin parametros
@NoArgsConstructor
//@Data te permite generar los metodos get y set
@Data
//@Entity define la entidad con la que se va a trabajar
@Entity(name="DistritoEntity")
//@Table define el nombre de la tabla con la cual se va a trabajar
@Table(name="distrito") 

public class DistritoEntity implements Serializable{
    //agregamos los atributos
    //agregamos el id de serializacion
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="iddistri")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nomdistri")
    private String distrito;
    @Column(name="estdistri")
    private boolean estado;
}
