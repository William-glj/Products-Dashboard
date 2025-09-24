package com.example.simpleProducts.entity;

import com.example.simpleProducts.classBox.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersJPA {

    /*
    Está mal nombrar a las instancias  de esta forma: first_name.
    Lo habitual sería seguir la convención firstName. En mi caso
    al menos en esta clase lo dejo de esta manera para ahorrar líneas de código
    en algo repetitivo.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_user;

    @Column(name ="first_name", length = 60)
    private String first_name;
    @Column(length = 60)
    private String last_name;

    private String company_mail;

    private int age;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @Column(length = 500)
    private  String psswrd;

    private  Integer mobile;

    public Integer getId_user() {
        return id_user;
    }
    public void setId_user(Integer id_user) {
        this.id_user = id_user;
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
    public String getCompany_mail() {
        return company_mail;
    }
    public void setCompany_mail(String company_mail) {
        this.company_mail = company_mail;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getPsswrd() {
        return psswrd;
    }
    public void setPsswrd(String psswrd) {
        this.psswrd = psswrd;
    }
    public Integer getMobile() {
        return mobile;
    }
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

















}
