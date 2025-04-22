package rrhh.rrhh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rrhh.rrhh.models.Empleado;
import rrhh.rrhh.services.IEmpleadoServices;

import java.util.List;

@RestController

//http://localhost:8080/rrhh-app
@RequestMapping("rrhh-app")
@CrossOrigin (value = "http://localhost:3000")

public class EmpleadoController {
    @Autowired
    private IEmpleadoServices empleadoServices;

    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados(){
        var empleados = empleadoServices.ListarEmpleados();
        return empleados;
    }

    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        return empleadoServices.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> buscarEmpleadoporId(@PathVariable Integer id){
        Empleado empleado = empleadoServices.buscarEmpleadoporId(id);
        return ResponseEntity.ok(empleado);
    }
}
