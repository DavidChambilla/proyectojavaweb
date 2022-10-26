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
@Entity(name="ProductoEntity") 
//@Table define el nombre de la tabla con la cual se va a trabajar
@Table(name="producto") 

public class ProductoEntity implements Serializable{
    //agregamos los atributos
    //agregamos el id de serializacion
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nompro")
    private String nombre;
    @ManyToOne
    @JoinColumn(name="idcat",nullable = false)
    private CategoriaEntity idcat;
    @Column(name="descri")
    private String Descripcion;
    @Column (name="stock")
    private long Stock;
    @Column (name="prec")
    private double Precio;
    @Column(name="est")
    private boolean estado;
}
