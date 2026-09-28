package com.example.employee_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long empId;
    private String firstName;
    private String lastName;
    private Date doj;

}
