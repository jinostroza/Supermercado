package com.company;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jinostrozau on 05-10-2017.
 */
public class Supermercado implements InterfaceSuper{

    public LinkedList<Cliente> filaClientes;
    public Cliente cliente;
    public Caja caja;
    public final int HORARIOATENCION = 420; // 7 horas en minutos
    public int clientesAtendidos = 0;
    public Caja caja1 = null;
    public Caja caja2 = null;
    public Caja caja3 = null;
    public Caja caja4 = null;

    public static void main(String[] args) {

        Supermercado simulador = new Supermercado();

        simulador.init(23);

        for(int i=0;i<5;i++) {
            simulador.compra(i);
        }

        System.out.println("Total Clientes Atendidos: "+simulador.getClientesAtendidos());
    }

    public  void init(int numClientes){
        int min = 1;
        int max = 3;

        filaClientes = new LinkedList<Cliente>();

        caja1 = new Caja(1, true, 90, 150);
        caja2 = new Caja(2, true, 120, 300);
        caja3 = new Caja(3, true, 120, 240);
        caja4 = new Caja(4, true, 120, 270);


        for (int i=0;i<numClientes;i++) {
            int idCaja = ThreadLocalRandom.current().nextInt(min, max + 1); //numero aleatorio caja
            cliente = new Cliente(i,idCaja, false );
            filaClientes.add(cliente);
            System.out.println("Total Clientes  en fila: "+filaClientes.size());
        }
    }

    @Override
    public void compra(int idCliente) {

        validaCaja4();
        cliente = filaClientes.get(idCliente);
        cliente.setComprando(true);
        cliente.getIdCaja();
        System.out.println("Cliente comprando en caja "+cliente.getIdCaja());
        filaClientes.remove(idCliente); //elimina al cliente de la fila
        clientesAtendidos++;

        System.out.println("Total Clientes  en fila: "+filaClientes.size());
    }

    public void salir(){

    }

    public void validaCaja4(){
        if(filaClientes.size()>20){ //abre caja 4
            caja4.setDisponible(true);
            System.out.println("Caja 4 habilitada");
        }else{
            caja4.setDisponible(false);
            System.out.println("Caja 4 deshabilitada");
        }
    }

    @Override
    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    @Override
    public int getTamanoMedioFila() {
        return 0;
    }

    @Override
    public int getTamanoMaximoFila() {
        return 0;
    }

    @Override
    public int getTiempoMaximoEspera() {
        return 0;
    }

    @Override
    public int getTiempoAbiertaCuartaCaja() {
        return 0;
    }
}
