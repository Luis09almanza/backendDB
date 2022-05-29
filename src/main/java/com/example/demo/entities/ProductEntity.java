package com.example.demo.entities;
import javax.persistence.*;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator( name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(20)", nullable = false)
    private String name;
    @Column(name = "price", columnDefinition = "int", nullable = false)
    private Integer price;
    @Column(name = "brand", columnDefinition = "varchar(20)", nullable = false)
    private String brand;
    @Column(name = "stock", columnDefinition = "varchar(20)", nullable = false)
    private String stock;

    public ProductEntity(){
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
