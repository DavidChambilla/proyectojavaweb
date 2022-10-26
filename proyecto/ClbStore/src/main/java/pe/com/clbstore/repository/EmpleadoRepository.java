
package pe.com.clbstore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.clbstore.entity.EmpleadoEntity;


public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long>{
    @Query("select c from EmpleadoEntity c where c.estado=1")
    List<EmpleadoEntity> findAllCustom();
}
