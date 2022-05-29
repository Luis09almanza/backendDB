package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator( name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(30)", nullable = false)
    private String name;
    @Column(name = "product", columnDefinition = "varchar(20)", nullable = false)
    private String product;
    @Column(name = "price", columnDefinition = "int", nullable = false)
    private Integer price;
    @Column(name = "telephone", columnDefinition = "varchar(20)", nullable = false)
    private String telephone;
    @Column(name = "email", columnDefinition = "varchar(30)", nullable = false)
    private String email;

    public SupplierEntity(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
