
package pe.com.clbstore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.clbstore.entity.DetalleVentaEntity;


public interface DetalleVenta extends JpaRepository<DetalleVentaEntity, Long>{
    @Query("select c from DetalleVentaEntity c where c.estado=1")
    List<DetalleVentaEntity> findAllCustom();   
}
