package repository;

import entity.Employee;

import java.util.Optional;

public interface AdministratorRepository{
     Optional<Employee> findEmployeeById(Long id);

     String save (String animal);
}
