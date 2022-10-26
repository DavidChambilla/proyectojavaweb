package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.VentaEntity;

public interface VentaService {
    //funcion para mostrar todos los datos
    List<VentaEntity> findAll();
    //funcion para buscar por codigo
    Optional<VentaEntity> findById(Long id);
    //funcion para registrar
    VentaEntity add(VentaEntity c);
    //funcion para actualizar
    VentaEntity update(VentaEntity c);
    //funcion para eliminar
    VentaEntity delete(VentaEntity c);
    //funcion para mostrar datos habilitados
    List<VentaEntity> findAllCustom(); 
}
