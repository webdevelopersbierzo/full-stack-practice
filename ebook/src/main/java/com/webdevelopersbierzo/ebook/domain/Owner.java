package com.webdevelopersbierzo.ebook.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="owner_id")
    private Long ownerId;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="owner")
    private List<Car> cars;
    public Owner() {
    }

    public Owner(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
