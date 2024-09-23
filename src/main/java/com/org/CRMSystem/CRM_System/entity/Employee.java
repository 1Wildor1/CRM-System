package com.org.CRMSystem.CRM_System.entity;

import com.org.CRMSystem.CRM_System.entity.Enum.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employee {
    public Employee() {
    }

    public Employee(String name, String surname, int age, int number, Role role, String password, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
        this.role = role;
        this.password = password;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private int age;
    private int number;
    private Role role;
    private String password;
    private double salary;

}
