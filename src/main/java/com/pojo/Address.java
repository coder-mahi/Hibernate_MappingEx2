package com.pojo;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "personid")  // Mapping primary key to the table column
    private int personId;

    @Column(name = "h_no")  // Mapping to "h_no" column in the database
    private String hNo;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    // Getter and Setter for personId
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    // Getter and Setter for hNo
    public String getHNo() {  // Ensure this matches Hibernate's expected convention
        return hNo;
    }

    public void setHNo(String hNo) {
        this.hNo = hNo;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and Setter for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
