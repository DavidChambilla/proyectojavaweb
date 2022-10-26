
package pe.com.clbstore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.clbstore.entity.VentaEntity;


public interface VentaRepository extends JpaRepository<VentaEntity, Long>{
    @Query("select c from VentaEntity c where c.estado=1")
    List<VentaEntity> findAllCustom();
}
