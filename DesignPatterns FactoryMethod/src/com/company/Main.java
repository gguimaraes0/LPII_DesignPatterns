package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transport transport = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecione a empresa de entrega");
        System.out.println("1- Uber");
        System.out.println("2- Mototáxi");
        int result = teclado.nextInt();
        if(result == 1)
        {
            transport = new CarTransport();
        }
        else if(result == 2)
        {
            transport = new MotorcycleTransport();
        }
        if (transport != null)
        {
            transport.StartTransport();
        }
    }
}
