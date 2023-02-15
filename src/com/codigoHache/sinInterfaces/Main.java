package com.codigoHache.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CocheCrud cocheCrudImpl = new CocheCrud();

        Coche delorean = new Coche("Delorean", 123456, 1980.60, true );
        Coche ferrari = new Coche("Ferrari", 123456, 1980.60, true );
        Coche cadillac = new Coche("Cadillac", 123456, 1980.60, false );
        Coche porsche = new Coche("Porsche", 123456, 1980.60, true );


        cocheCrudImpl.guardar(delorean);
        cocheCrudImpl.guardar(ferrari);
        cocheCrudImpl.guardar(cadillac);
        cocheCrudImpl.guardar(porsche);


        List<Coche> coches = cocheCrudImpl.buscar();
        System.out.println(coches);


    }
}
