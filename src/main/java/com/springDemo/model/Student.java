package com.springDemo.model;
import javax.persistence.*;

@Entity
@Table (name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private  int id;

    @Column(name="firstName",nullable = false)
    private  String firstName;

    @Column(name="lastName",nullable = false)
    private String lastName;

    @Column(name="email_Id",nullable = false)
    private String emailId;

    public Student(){}

    public Student(String firstName, String lastName, String emailId){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}



