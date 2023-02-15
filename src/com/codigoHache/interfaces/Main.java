package com.codigoHache.interfaces;

import com.codigoHache.sinInterfaces.Coche;

public class Main {
    static CocheCRUDImpl cocheCRUDimpl;

    public static void main(String[] args) {
        cocheCRUDimpl.findAll();
        cocheCRUDimpl.save(new Coche());

         cocheCRUDimpl.delete(new Coche());
    }
}
