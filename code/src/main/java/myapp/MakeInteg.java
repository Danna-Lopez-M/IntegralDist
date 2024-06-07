package main;

import client.IntegralClient;

public class MakeInteg {
    public static void main(String[] args) {
        System.out.println("Iniciando programa..."); // Mensaje de depuración
        IntegralClient client = new IntegralClient();
        client.run();
    }
}