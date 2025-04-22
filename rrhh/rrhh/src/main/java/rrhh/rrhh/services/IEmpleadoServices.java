package rrhh.rrhh.services;

import rrhh.rrhh.models.Empleado;

import java.util.List;

public interface IEmpleadoServices {
    public List<Empleado> ListarEmpleados();
    public Empleado buscarEmpleadoporId(Integer idEmpleado);
    public Empleado guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
}
