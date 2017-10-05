package com.company;

/**
 * Created by jinostrozau on 05-10-2017.
 */
public class Cliente {

    private int idCliente;
    private int idCaja;
    private boolean isComprando;


    public Cliente(int idCliente, int idCaja, boolean isComprando){
        this.idCliente = idCliente;
        this.idCaja = idCaja;
        this.isComprando = isComprando;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public boolean isComprando() {
        return isComprando;
    }

    public void setComprando(boolean comprando) {
        isComprando = comprando;
    }
}
