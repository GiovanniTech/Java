/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Giovanni
 */
public class Veiculos {

    //atributos
    private Integer codVeiculo;
    private String nomeVeiculo;
    private String marcaVeiculo;
    private String tipoVeiculo;
    private Double valorVeiculo;
    private Integer anoVeiculo;

    //construtor
    public Veiculos(Integer cd, String nmVeiculo, String mrVeiculo, String tpVeiculo, Double vlVeiculo, Integer anVeiculo) {
        this.codVeiculo = cd;
        this.nomeVeiculo = nmVeiculo;
        this.marcaVeiculo = mrVeiculo;
        this.tipoVeiculo = tpVeiculo;
        this.valorVeiculo = vlVeiculo;
        this.anoVeiculo = anVeiculo;
    }
    //métodos de acesso

    public Veiculos() {
    }

    public Integer getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(Integer codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public Integer getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Integer anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }
}
