
package pe.com.clbstore.service;
import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.DetalleVentaEntity;


public interface DetalleVentaService {
    //funcion para mostrar todos los datos
    List<DetalleVentaEntity> findAll();
    //funcion para buscar por codigo
    Optional<DetalleVentaEntity> findById(Long id);
    //funcion para registrar
    DetalleVentaEntity add(DetalleVentaEntity c);
    //funcion para actualizar
    DetalleVentaEntity update(DetalleVentaEntity c);
    //funcion para eliminar
    DetalleVentaEntity delete(DetalleVentaEntity c);
    //funcion para mostrar datos habilitados
    List<DetalleVentaEntity> findAllCustom(); 
}
