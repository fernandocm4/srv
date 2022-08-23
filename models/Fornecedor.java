/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Fernando Candido
 */
public class Fornecedor {
    private String nome;
    private String cpf;
    private String numero;
    private String marcaveiculo;
    private String modeloveiculo;
    private String cordeveiculo;
    private String placaveiculo;
    private int id;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the marcaveiculo
     */
    public String getMarcaveiculo() {
        return marcaveiculo;
    }

    /**
     * @param marcaveiculo the marcaveiculo to set
     */
    public void setMarcaveiculo(String marcaveiculo) {
        this.marcaveiculo = marcaveiculo;
    }

    /**
     * @return the modeloveiculo
     */
    public String getModeloveiculo() {
        return modeloveiculo;
    }

    /**
     * @param modeloveiculo the modeloveiculo to set
     */
    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }

    /**
     * @return the cordeveiculo
     */
    public String getCordeveiculo() {
        return cordeveiculo;
    }
    
    public void setCordeveiculo(String cordeveiculo){
        this.cordeveiculo = cordeveiculo;
    }
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the placaveiculo
     */
    public String getPlacaveiculo() {
        return placaveiculo;
    }

    /**
     * @param placaveiculo the placaveiculo to set
     */
    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }
    
}
