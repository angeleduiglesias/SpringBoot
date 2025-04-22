package rrhh.rrhh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rrhh.rrhh.models.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
