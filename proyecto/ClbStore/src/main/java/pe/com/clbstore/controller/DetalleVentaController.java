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
import pe.com.clbstore.entity.DetalleVentaEntity;
import pe.com.clbstore.service.DetalleVentaService;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
    @Autowired
    private DetalleVentaService detalleventaservice;
    @GetMapping
    public List<DetalleVentaEntity> findAll() {
        return detalleventaservice.findAll();
    }
    @GetMapping("/custom")
    public List<DetalleVentaEntity> findAllCustom() {
        return detalleventaservice.findAll();
    }
    @GetMapping("/{id}")
       public Optional<DetalleVentaEntity> findById(@PathVariable Long id) {
        return detalleventaservice.findById(id);
    }
    @PostMapping
    public DetalleVentaEntity add(@RequestBody DetalleVentaEntity c) {
        return detalleventaservice.add(c);
    }
    @PutMapping("/{id}")
    public DetalleVentaEntity update(@PathVariable Long id, @RequestBody DetalleVentaEntity c) {
        c.setId(id);
        return detalleventaservice.update(c);
       }
    @DeleteMapping("/{id}")
    public DetalleVentaEntity delete(@PathVariable Long id) {
        DetalleVentaEntity objventa = new DetalleVentaEntity();
        objventa.setEstado(false);
        return detalleventaservice.delete(DetalleVentaEntity.builder().id(id).build());
    }
}
