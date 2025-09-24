package com.example.simpleProducts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "price")
@NoArgsConstructor
@AllArgsConstructor
public class PriceJPA {

    @Id
    @Column(name = "isbn_price")
    private Long isbnPrice;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(precision = 10, scale = 2)
    private BigDecimal sale = BigDecimal.valueOf(0.00);

    @Column(precision = 5, scale = 2)
    private BigDecimal taxes = BigDecimal.valueOf(0.00);

    @Column(length = 10)
    private String coin = "USD";

    @OneToOne
    @JoinColumn(name = "isbn_price",
            referencedColumnName = "isbn",
            insertable = false, updatable = false)
    private ProductsJPA product;

    // Getters and setters

    public Long getIsbnPrice() {
        return isbnPrice;
    }

    public void setIsbnPrice(Long isbnPrice) {
        this.isbnPrice = isbnPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public ProductsJPA getProduct() {
        return product;
    }

    public void setProduct(ProductsJPA product) {
        this.product = product;
    }
}
