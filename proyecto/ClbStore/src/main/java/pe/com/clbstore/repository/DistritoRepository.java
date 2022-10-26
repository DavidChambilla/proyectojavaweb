
package pe.com.clbstore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.clbstore.entity.DistritoEntity;


public interface DistritoRepository extends JpaRepository<DistritoEntity, Long>{
    @Query("select c from DistritoEntity c where c.estado=1")
    List<DistritoEntity> findAllCustom();
}
