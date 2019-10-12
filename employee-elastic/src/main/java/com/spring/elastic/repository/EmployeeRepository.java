package com.spring.elastic.repository;

import com.spring.elastic.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface EmployeeRepository extends ElasticsearchCrudRepository<Employee, Long> {

    List<Employee> findByOrganizationName(String name);

    List<Employee> findByName(String name);
}
