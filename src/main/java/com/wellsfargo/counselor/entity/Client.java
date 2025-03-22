package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.MetadataDefinition;
import jdk.jfr.Name;
import jdk.jfr.Relational;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long cientId;

    @MetadataDefinition
    @Relational
    @Name("package com.wellsfargo.counselor.entity")
    public @interface advisorId{};

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int phoneNumber;

    @Column(nullable = false)
    private String email;

    protected Client() {}

    public Client(String firstName, String lastName,
                  String address, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getCientId() {
        return cientId;
    }

    public void setCientId(long cientId) {
        this.cientId = cientId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
