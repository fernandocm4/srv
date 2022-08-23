/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Fernando Candido
 */
public class Agendamentos {
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private String datadrive;
    private String datarev;
    private String horario;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the datadrive
     */
    public String getDatadrive() {
        return datadrive;
    }

    /**
     * @param datadrive the datadrive to set
     */
    public void setDatadrive(String datadrive) {
        this.datadrive = datadrive;
    }

    /**
     * @return the datarev
     */
    public String getDatarev() {
        return datarev;
    }

    /**
     * @param datarev the datarev to set
     */
    public void setDatarev(String datarev) {
        this.datarev = datarev;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
