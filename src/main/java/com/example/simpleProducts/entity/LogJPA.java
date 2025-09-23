package com.example.simpleProducts.entity;


import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

@Entity
@Table(name = "log_user")
public class LogJPA {
/*
CREATE TABLE log_user (
id_log INT PRIMARY KEY,
time_moment DATETIME,
action_register TEXT,
FOREIGN KEY (id_log) REFERENCES users(id_user)
);
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_log;

    private LocalDateTime time_moment;

    private String action_register;

    @ManyToOne//Tipo de relación; pueden haber muchos elementos de la clase superior y uno de la inferior.
    //name = "id_user" --> es el nombre de la columnna dentro de log en MySQL.
    //@ForeignKey(name = "fk_loguser_user" --> es un nombre personalizado, puede ser cualquier valor.
    //Si la clase UsersJPA esta bien estructurada al crear un elemento se asociará al usuario en cuestión.
    @JoinColumn(name = "id_user", foreignKey = @ForeignKey(name = "fk_loguser_user"))
    private UsersJPA user;









}
