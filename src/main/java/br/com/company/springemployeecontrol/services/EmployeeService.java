package br.com.company.springemployeecontrol.services;

import br.com.company.springemployeecontrol.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;




}
