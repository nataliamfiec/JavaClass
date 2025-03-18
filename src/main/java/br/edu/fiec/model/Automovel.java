package br.edu.fiec.model;

public class Automovel {

    private Float motor;

    private Integer quantidadeRodas;

    private String marca;

    private  String modelo;

    private String tipoFreio;

//MÉTODOS CONSTRUTORES

    public Automovel() {}

    public Automovel(Float motor, Integer quantidadeRodas, String marca, String modelo, String tipoFreio){
        setMotor(motor);
        setQuantidadeRodas(quantidadeRodas);
        setMarca(marca);
        setModelo(modelo);
        setTipoFreio(tipoFreio);
    }


//GETS E SETS DOS ATRIBUTOS
    public Float getMotor(){
        return this.motor;
    }

    public void setMotor(Float motor){
        this.motor = motor;
    }

    public Integer getQuantidadeRodas() {
        return this.quantidadeRodas;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

//MÉTODOS

//método publico acesso de todo o lugar, void não retorna nada, com parametro obrigatório
    public void acelerar(String velocidade){
        System.out.println("Acelerou até " + velocidade + " km/h!!");
    }

//método sem retorno e sem parametros
    public void parar(){
        System.out.println("Parou!!!");
    }

//método com retorno e sem parametro
    public String buzinar(){
        return "Bibi!!";
    }







}


