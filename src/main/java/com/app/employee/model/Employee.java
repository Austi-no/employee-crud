package com.app.employee.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee  implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Position cant be null")
    @NotBlank(message = "position cant be blank")
    @Column(name = "position")
    private String position;

    @NotNull(message = "title cant be null")
    @NotBlank(message = "title cant be blank")
    @Column(name = "title")
    private String title;

    @NotNull(message = "firstName cant be null")
    @NotBlank(message = "firstName cant be blank")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Position cant be null")
    @NotBlank(message = "position cant be blank")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "gender cant be null")
    @NotBlank(message = "gender cant be blank")
    @Column(name = "gender")
    private String gender;

    @NotNull(message = "age cant be null")
    @NotBlank(message = "age cant be blank")
    @Column(name = "age")
    private String age;


    @NotNull(message = "salary cant be null")
    @NotBlank(message = "salary cant be blank")
    @Column(name = "salary")
    private String salary;

    @Column(name = "date_created")
    private Date dateCreated;

    public Employee() {
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
