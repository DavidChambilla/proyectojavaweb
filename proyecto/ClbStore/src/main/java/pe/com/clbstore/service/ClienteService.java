package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.ClienteEntity;

public interface ClienteService {
    //funcion para mostrar todos los datos
    List<ClienteEntity> findAll();
    //funcion para buscar por codigo
    Optional<ClienteEntity> findById(Long id);
    //funcion para registrar
    ClienteEntity add(ClienteEntity c);
    //funcion para actualizar
    ClienteEntity update(ClienteEntity c);
    //funcion para eliminar
    ClienteEntity delete(ClienteEntity c);
    //funcion para mostrar datos habilitados
    List<ClienteEntity> findAllCustom(); 
}
