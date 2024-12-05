package com.example.Servidorsura6.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "matricula", nullable = false, length = 50)
    private String modelo;
    private String marca;
    private String cilindraje;
    private String color;
    private String descripcion;
    private Integer numerosSiniestros;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String modelo, String marca, String cilindraje, String color, String descripcion, Integer numerosSiniestros) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.descripcion = descripcion;
        this.numerosSiniestros = numerosSiniestros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumerosSiniestros() {
        return numerosSiniestros;
    }

    public void setNumerosSiniestros(Integer numerosSiniestros) {
        this.numerosSiniestros = numerosSiniestros;
    }
}
