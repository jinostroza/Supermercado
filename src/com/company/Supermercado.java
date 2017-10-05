package com.company;

import java.util.LinkedList;

/**
 * Created by jinostrozau on 05-10-2017.
 */
public class Supermercado {

    private String nombre;
    private LinkedList<Cliente> filaClientes;
    private Cliente cliente;
    private Caja caja;
    private final int HORARIOATENCION = 420; // 7 horas en minutos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cliente> getFilaClientes() {
        return filaClientes;
    }

    public void setFilaClientes(LinkedList<Cliente> filaClientes) {
        this.filaClientes = filaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }
}
