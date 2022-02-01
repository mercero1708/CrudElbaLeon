package com.elba.leon.Crud.entities;

import lombok.Data;

@Data//clase para acceder a los datos
public class Coche {

    private String marca;
    private int ano;
    private int canPersonas;
    private  double precio;

}
