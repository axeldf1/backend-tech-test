package com.littlebill.api.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "Pseudo", nullable = false)
    private String pseudo;
    private String lastName;
    private String firstName;
    private String password;

    public User(Long id, String lastName, String firstName, String pseudo, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pseudo = pseudo;
        this.password = password;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
