package br.com.company.springemployeecontrol.services;

import br.com.company.springemployeecontrol.models.EmployeeModel;
import br.com.company.springemployeecontrol.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Transactional
    public EmployeeModel save(EmployeeModel employeeModel) {
        return iEmployeeRepository.save(employeeModel);
    }
}
