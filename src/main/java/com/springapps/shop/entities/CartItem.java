package com.springapps.shop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id")
    @JsonBackReference("cartitem-product")
    private Product product;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonBackReference("cartitem-user")
    private User user;

    @Column
    private Integer quantity;

    public CartItem() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
