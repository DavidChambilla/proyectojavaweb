
package pe.com.clbstore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.clbstore.entity.RolEntity;



   public interface RolRepository extends JpaRepository<RolEntity, Long>{
    @Query("select c from RolEntity c where c.estado=1")
       List<RolEntity> findAllCustom();
} 

