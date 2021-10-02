package com.company;

class CarTransport extends Transport {
    @Override
    protected IVehicle CreateTransport() {
        return new Car();
    }
}
