package com.example.simpleProducts.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stock")
@AllArgsConstructor
@NoArgsConstructor
public class StockJPA {

    @Id
    @Column(name = "isbn_stock")
    private Long isbnStock;

    @Column(name = "stock_available", nullable = false)
    private Integer stockAvailable = 0;

    @Column(name = "stock_min", nullable = false)
    private Integer stockMin = 0;

    @Column(length = 200)
    private String location;

    @Column(length = 60)
    private String maker;

    @OneToOne
    @JoinColumn(name = "isbn_stock", referencedColumnName = "isbn", insertable = false, updatable = false)
    private ProductsJPA product;

    // Getters and setters

    public Long getIsbnStock() {
        return isbnStock;
    }

    public void setIsbnStock(Long isbnStock) {
        this.isbnStock = isbnStock;
    }

    public Integer getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(Integer stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        this.stockMin = stockMin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public ProductsJPA getProduct() {
        return product;
    }

    public void setProduct(ProductsJPA product) {
        this.product = product;
    }
}

