package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator( name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;
    @Column(name = "first_name", columnDefinition = "varchar(20)", nullable = false)
    private String first_name;
    @Column(name = "last_name", columnDefinition = "varchar(50)", nullable = false)
    private String last_name;
    @Column(name = "address", columnDefinition = "varchar(60)", nullable = false)
    private String address;
    @Column(name = "telephone", columnDefinition = "varchar(60)", nullable = false)
    private String telephone;
    @Column(name = "email", columnDefinition = "varchar(60)", nullable = false)
    private String email;

    public CustomerEntity(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
