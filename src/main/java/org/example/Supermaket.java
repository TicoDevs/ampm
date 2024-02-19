package org.example;

import java.util.Arrays;
import java.util.List;

// Clase principal que contiene el método main
public class Supermaket {
    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        //Crea los clientes con los productos
        class_Client client1 = new class_Client(new int[]{1, 3, 5, 8}, "Cliente_1");
        class_Client client2 = new class_Client(new int[]{2, 4, 6, 9}, "Cliente_2");

        // Crear dos vendedores que atienden los productos de los clientes
        class_Seller vendedor1 = new class_Seller("Jennifer", client2);
        class_Seller vendedor2 = new class_Seller("Christian", client1);

        //Crea lista de vendedores
        List<class_Seller> sellers = Arrays.asList(vendedor1,vendedor2);

        //processa la lista de los vendedores para los resultados en sequential por medio del parallelStream
        //Simula atender varios clientes a la vez
        sellers.parallelStream().forEach(s -> s.processClient());
    }
}