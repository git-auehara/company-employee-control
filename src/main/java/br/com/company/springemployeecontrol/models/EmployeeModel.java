package br.com.company.springemployeecontrol.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Data
@Table(name = "TB_EMPLOYEE")
public class EmployeeModel implements Serializable {

    private static final long serialVersionUID = 1L;

    public EmployeeModel(){
        this.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

}
