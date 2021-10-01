package com.company;

class Motorcycle implements IVehicle {

    public void GetCargo()
    {
        System.out.println("Pegamos a encomenda.");
    }

    public void StartRoute()
    {
        System.out.println("Iniciando a entrega.");
        GetCargo();
    }
}
