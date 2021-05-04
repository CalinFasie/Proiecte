package com.company.employee;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmployeeController {
    private final EmployeeRepository repository;
    public EmployeeController(EmployeeRepository repository){
        this.repository=repository;

    }
    @GetMapping("/employees")
    List<Employee> all(){

        return (List<Employee>) repository.findAll();
    }
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee){

        return repository.save(newEmployee);
    }
    @GetMapping("/employees/{id}")
    EntityModel<Employee> one(@PathVariable Long id){
       Employee employee = repository.findById(id)
                .orElseThrow(()-> new EmployeeNotFoundException(id));
        return EntityModel.of(employee,//
                linkTo(methodOn(EmployeeController.class).one(id)).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
    @PutMapping("/employees/{id}")
    Employee replaeceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id){
        return repository.findById(id)
        .map(employee -> {
            employee.setFirstName(newEmployee.getFirstName());
            employee.setLastName(newEmployee.getLastName());
            return repository.save(employee);
        })
                .orElseGet(() ->{
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable long id){
        repository.deleteById(id);
    }
}
