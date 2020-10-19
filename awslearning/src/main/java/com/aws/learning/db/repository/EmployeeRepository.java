package com.aws.learning.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.aws.learning.db.entities.Employee;
/**
 * Spring automatically implements this repository interface in a bean that has the same name 
 * (with a change in the case — it is called userRepository).
 * @author madhu
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
