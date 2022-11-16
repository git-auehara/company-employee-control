package br.com.company.springemployeecontrol.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class EmployeeDTO {

    @NotBlank
    @Size(max = 255)
    private String name;

}
