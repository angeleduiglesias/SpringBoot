package rrhh.rrhh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rrhh.rrhh.models.Empleado;
import rrhh.rrhh.repository.EmpleadoRepository;

import java.util.List;

@Service
public class EmpleadoServices implements IEmpleadoServices{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> ListarEmpleados() {

        return empleadoRepository.findAll();
    }

    @Override
    public Empleado buscarEmpleadoporId(Integer idEmpleado) {
        Empleado empleado = empleadoRepository.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {

        return empleadoRepository.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {

        empleadoRepository.delete(empleado);
    }
}
