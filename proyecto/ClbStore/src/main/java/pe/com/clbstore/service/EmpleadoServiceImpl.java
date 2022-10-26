package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.EmpleadoEntity;
import pe.com.clbstore.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoRepository empleadorepositorio;
    
    @Override
    public List<EmpleadoEntity> findAll() {
        return empleadorepositorio.findAll();
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return empleadorepositorio.findById(id);
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity c) {
        return empleadorepositorio.save(c); 
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity c) {
        EmpleadoEntity objempleado=empleadorepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objempleado);
        return empleadorepositorio.save(objempleado);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity c) {
        EmpleadoEntity objempleado=empleadorepositorio.getById(c.getId());
        objempleado.setEstado(false);
        return empleadorepositorio.save(objempleado);
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return empleadorepositorio.findAllCustom(); 
    }
    
}
