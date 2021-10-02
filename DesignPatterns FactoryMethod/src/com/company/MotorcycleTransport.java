package com.company;

class MotorcycleTransport extends Transport {
     @Override
     protected IVehicle createTransport() {
         return new Motorcycle();
     }
 }
