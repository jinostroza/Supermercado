package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jinostrozau on 05-10-2017.
 */
public class Simulador implements InterfaceSuper{

    public LinkedList<Cliente> filaClientes;
    public Cliente cliente;
    public Caja caja;
    public final int HORARIOATENCION = 420; // 7 horas en minutos
    public int clientesAtendidos = 0;
    public Caja caja1 = null;
    public Caja caja2 = null;
    public Caja caja3 = null;
    public Caja caja4 = null;
    int numClientes = 0 ;
    int min=1;
    int max=3;

    static Random rnd;
    static double time;
    double endTime;

    Simulador(long seed, double simDuration) {
        time = 0.0;
        //events = new ListQueue();
        rnd = new Random(seed);
        endTime = simDuration;
    }

    Simulador(){}


    public static void main(String[] args) {

        Simulador simulador = new Simulador();
        simulador.init(25); //se inicializa con cantidad de clientes
        simulador.test();

        for(int i=0;i<5;i++) {
            simulador.compra(i);
        }

        System.out.println("Total Clientes Atendidos: "+simulador.getClientesAtendidos());
    }

    public void init(int numClientes){

        filaClientes = new LinkedList<Cliente>();

        caja1 = new Caja(1, true, 90, 150);
        caja2 = new Caja(2, true, 120, 300);
        caja3 = new Caja(3, true, 120, 240);
        caja4 = new Caja(4, true, 120, 270);

        this.numClientes = numClientes;

    }

    public void test(){

        if(caja4.isDisponible()){
            max = 4;
        }

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
        filaClientes.removeFirst(); //elimina al 1er cliente de la fila
        clientesAtendidos++;

        System.out.println("Total Clientes  en fila: "+filaClientes.size());
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

    void doAllEvents() {
        Evento e;
        /*while ((e = (Evento) events.removeFirst()) != null && time < endTime) {
            if(time > e.time)
                System.out.printf("Something is worng! time=%f eventtime=%f",time,e.time);
            time = e.time;
            e.run();
            System.out.printf("\n Time = %f", time);

        }*/
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
