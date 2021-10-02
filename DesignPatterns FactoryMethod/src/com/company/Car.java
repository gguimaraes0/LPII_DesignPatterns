package com.company;

class Car implements IVehicle {

    public void GetCargo()
    {
        System.out.println("Pegamos os passageiros!");
    }

    public void StartRoute()
    {
        System.out.println("Iniciando o trajeto.");
        GetCargo();
    }
}
