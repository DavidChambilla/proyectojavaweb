package pe.com.clbstore.entity;

import java.io.Serializable; 
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Entity(name="ClienteEntity") 
//@Table define el nombre de la tabla con la cual se va a trabajar
@Table(name="cliente") 

public class ClienteEntity implements Serializable{
    //agregamos los atributos
    //agregamos el id de serializacion
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcliet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="iddistri",nullable = false)
    private DistritoEntity iddistrito;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="districli")
    private String distrito;
    @Column (name="sexo")
    private String sexo;
    @Column (name="celular")
    private String celular;
    @Column (name="dni")
    private String dni;
    @Column(name="estclie")
    private boolean estado;
    @Column (name="idventclie")
    private long idventa;
    
}
