package com.codigoHache.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCrud {

   private List<Coche> coches = new ArrayList<>();
    public void guardar(Coche coche){
        coches.add(coche);
    }

    public List <Coche> buscar() {
        return coches;
    }



}
