package pe.com.clbstore.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.clbstore.entity.EmpleadoEntity;
import pe.com.clbstore.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoservice;
    @GetMapping
    public List<EmpleadoEntity> findAll() {
        return empleadoservice.findAll();
    }
    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom() {
        return empleadoservice.findAll();
    }
    @GetMapping("/{id}")
       public Optional<EmpleadoEntity> findById(@PathVariable Long id) {
        return empleadoservice.findById(id);
    }
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity c) {
        return empleadoservice.add(c);
    }
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable Long id, @RequestBody EmpleadoEntity c) {
        c.setId(id);
        return empleadoservice.update(c);
       }
    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable Long id) {
        EmpleadoEntity objempleado = new EmpleadoEntity();
        objempleado.setEstado(false);
        return empleadoservice.delete(EmpleadoEntity.builder().id(id).build());
    } 

}
