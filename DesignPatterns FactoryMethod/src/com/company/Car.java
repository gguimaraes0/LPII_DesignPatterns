package com.company;

class Car implements IVehicle {

    public void getCargo()
    {
        System.out.println("Pegamos os passageiros!");
    }

    public void startRoute()
    {
        System.out.println("Iniciando o trajeto.");
        getCargo();
    }
}
