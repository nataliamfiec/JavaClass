package br.edu.fiec.model;

//ESSA CLASSE ESTÁ HERDANDO TUDO DA CLASSE AUTOMOVEL
public class Carro extends Automovel {

//  ATRIBUTOS
    private Integer quantidadePortas;

    private String tipoMotor;

//    MÉTODOS CONSTRUTORES

    public Carro() {}

    public Carro(Float motor, Integer quantidadeRodas, String marca, String modelo, String tipoFreio, Integer quantidadePortas, String tipoMotor){
        super(motor, quantidadeRodas, marca, modelo, tipoFreio);
        setQuantidadePortas(quantidadePortas);
        setTipoMotor(tipoMotor);
    }


//    GETS E SETS DOS ATRIBUTOS
    public Integer getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }


}
