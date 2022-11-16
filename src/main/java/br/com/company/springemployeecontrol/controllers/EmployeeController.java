package br.com.company.springemployeecontrol.controllers;

import br.com.company.springemployeecontrol.dtos.EmployeeDTO;
import br.com.company.springemployeecontrol.models.EmployeeModel;
import br.com.company.springemployeecontrol.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO){
        EmployeeModel employeeModel = new EmployeeModel();
        BeanUtils.copyProperties(employeeDTO, employeeModel );
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.save(employeeModel));
    }


}
