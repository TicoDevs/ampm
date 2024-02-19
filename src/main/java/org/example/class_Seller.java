package org.example;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class class_Seller {
    // Atributo que indica el nombre de la caja registradora
    String name;
    // Atributo que simula la cola de clientes que espera ser atendida por este vendedor
    class_Client queueClient;

    // Constructor que recibe el número de la caja y la cola de clientes
    public class_Seller(String name, class_Client queueClient) {
        this.name = name;
        this.queueClient = queueClient;
    }
    //Procesa los productos de los clientes e imprime los mensajes en consola sobre el proceso
    public void processClient(){
        long timeStart = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        // Mostrar un mensaje indicando que se va a atender al cliente
        System.out.println("El vendedor " + name + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + queueClient.getName() + " EN EL TIEMPO: " + (timeStart -TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())));
        for (int i = 0; i < queueClient.getProduct().length; i++) {
            // Obtener el producto actual
            int producto = queueClient.getProduct()[i];
            long timeStartProcessProcces = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            // Mostrar un mensaje indicando que se va a procesar el producto
            System.out.println("Procesando el producto " + producto + " del cliente " + queueClient.getName() + "-> Tiempo: " + (timeStartProcessProcces - timeStart));
            // Simular que se tarda 2 segundos en procesar el producto
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long timeEnd = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        // Mostrar un mensaje indicando que se ha terminado de atender al cliente
        System.out.println("El vendedor " + name + " ha terminado de procesar al cliente " + queueClient.getName() +
                " EN EL TIEMPO: " + (timeEnd - timeStart));
    }
}
