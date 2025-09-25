package com.example.simpleProducts.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "picture")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PictureJPA {

    @Id
    @Column(name = "isbn_picture")
    private Long isbnPicture;

    @Lob
    @Column(length = 1000,nullable = false)
    private byte[] image;


    public byte[] getImage() {
        return image;
    }

    public void setIsbnPicture(Long isbnPicture) {
        this.isbnPicture = isbnPicture;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getIsbnPicture() {
        return isbnPicture;
    }
}
