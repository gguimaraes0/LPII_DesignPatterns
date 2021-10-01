package com.company;

class MotorcycleTransport extends Transport {
     @Override
     protected IVehicle CreateTransport() {
         return new Motorcycle();
     }
 }
