package br.com.company.springemployeecontrol.repositories;

import br.com.company.springemployeecontrol.models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeModel, Long> {

}
