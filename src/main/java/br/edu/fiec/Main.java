package br.edu.fiec;

import br.edu.fiec.model.Automovel;
import br.edu.fiec.model.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        //Instanciando o objeto automovel
        Automovel auto = new Automovel(1.0F, 4, "Fiat", "Uno", "Disco");

        auto.acelerar("90");
        auto.parar();
        System.out.println(auto.buzinar());

        //Instanciando o objeto carro
        Carro hb20 = new Carro(1.4F, 4, "Hyundai", "Hb20", "ABS", 4, "Combustão");
        hb20.acelerar("120");
        hb20.parar();
        System.out.println(hb20.buzinar());

    }
}