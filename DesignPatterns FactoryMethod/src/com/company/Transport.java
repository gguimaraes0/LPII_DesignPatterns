package com.company;

abstract class Transport  {

    public void StartTransport()
    {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }
    protected abstract IVehicle createTransport();

}