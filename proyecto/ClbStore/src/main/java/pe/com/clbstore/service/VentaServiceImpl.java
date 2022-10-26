package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.VentaEntity;
import pe.com.clbstore.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService{
    @Autowired
    private VentaRepository ventarepositorio;
    
    @Override
    public List<VentaEntity> findAll() {
        return ventarepositorio.findAll();
    }

    @Override
    public Optional<VentaEntity> findById(Long id) {
        return ventarepositorio.findById(id);
    }

    @Override
    public VentaEntity add(VentaEntity c) {
        return ventarepositorio.save(c); 
    }

    @Override
    public VentaEntity update(VentaEntity c) {
        VentaEntity objventa=ventarepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objventa);
        return ventarepositorio.save(objventa);
    }

    @Override
    public VentaEntity delete(VentaEntity c) {
        VentaEntity objventa=ventarepositorio.getById(c.getId());
        objventa.setEstado(false);
        return ventarepositorio.save(objventa);
    }

    @Override
    public List<VentaEntity> findAllCustom() {
        return ventarepositorio.findAllCustom(); 
    }
    
}
