
package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.DetalleVentaEntity;
import pe.com.clbstore.repository.DetalleVentaRepository;





public class DetalleVentaServiceImpl implements DetalleVentaService{
     @Autowired
    private DetalleVentaRepository detalleventarepositorio;
    
    @Override
    public List<DetalleVentaEntity> findAll() {
        return detalleventarepositorio.findAll();
    }

    @Override
    public Optional<DetalleVentaEntity> findById(Long id) {
        return detalleventarepositorio.findById(id);
    }

    @Override
    public DetalleVentaEntity add(DetalleVentaEntity c) {
        return detalleventarepositorio.save(c); 
    }

    @Override
    public DetalleVentaEntity update(DetalleVentaEntity c) {
        DetalleVentaEntity objdetalleventa=detalleventarepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objdetalleventa);
        return detalleventarepositorio.save(objdetalleventa);
    }

    @Override
    public DetalleVentaEntity delete(DetalleVentaEntity c) {
        DetalleVentaEntity objdetalleventa=detalleventarepositorio.getById(c.getId());
        objdetalleventa.setEstado(false);
        return detalleventarepositorio.save(objdetalleventa);
    }

    @Override
    public List<DetalleVentaEntity> findAllCustom() {
        return detalleventarepositorio.findAllCustom(); 
    }
    
}
