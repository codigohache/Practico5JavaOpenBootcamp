package com.codigoHache.sinInterfaces;

public class Coche {

    //Atributos
    String marca;
    int numChasis;
    double precio;
    boolean deportivo;

    //Constructores
      public Coche(){
      }

    public Coche(String marca, int numChasis, double precio, boolean deportivo) {
        this.marca = marca;
        this.numChasis = numChasis;
        this.precio = precio;
        this.deportivo = deportivo;
    }

    //Metodos

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", numChasis=" + numChasis +
                ", precio=" + precio +
                ", deportivo=" + deportivo +
                '}';
    }
}
