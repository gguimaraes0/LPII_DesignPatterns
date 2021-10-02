package com.company;

class Motorcycle implements IVehicle {

    public void getCargo()
    {
        System.out.println("Pegamos a encomenda.");
    }

    public void startRoute()
    {
        System.out.println("Iniciando a entrega.");
        getCargo();
    }
}
