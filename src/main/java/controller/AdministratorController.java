package controller;

import entity.Animal;
import entity.Employee;
import repository.AdministratorRepository;

import java.util.Optional;

public class AdministratorController {
    private AdministratorRepository repository;

    public Optional<Employee> findById(Long id){
        return repository.findEmployeeById(id);
    }

    public String registerAnimal (Animal animal){
        animal.getName();
        animal.getAge();
        animal.getRace();
        animal.getTypeSexual();

        return repository.save(String.valueOf(animal));

    }
}
