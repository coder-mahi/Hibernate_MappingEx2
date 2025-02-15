package com.pojo;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "personid") // Primary Key
    private int personId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

@Column(length = 255)
private String email;


    @OneToOne
    @JoinColumn(name = "personid")  // Foreign Key reference in Address table
    private Address address;

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
