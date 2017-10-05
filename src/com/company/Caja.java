package com.company;

/**
 * Created by jinostrozau on 05-10-2017.
 */
public class Caja {

    private int idCaja;
    private boolean isDisponible;
    private int tiempoMinAtencion;
    private int tiempoMaxAtencion;
    private int tiempoAtencion;
    private boolean isHabilitada;

    public Caja(int idCaja, boolean isDisponible, int tiempoMinAtencion, int tiempoMaxAtencion){
        this.idCaja = idCaja;
        this.isDisponible = isDisponible;
        this.setTiempoMinAtencion(tiempoMinAtencion);
        this.setTiempoMaxAtencion(tiempoMaxAtencion);
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public int getTiempoMinAtencion() {
        return tiempoMinAtencion;
    }

    public void setTiempoMinAtencion(int tiempoMinAtencion) {
        this.tiempoMinAtencion = tiempoMinAtencion;
    }

    public int getTiempoMaxAtencion() {
        return tiempoMaxAtencion;
    }

    public void setTiempoMaxAtencion(int tiempoMaxAtencion) {
        this.tiempoMaxAtencion = tiempoMaxAtencion;
    }

    public int getTiempoAtencion() {
        return tiempoAtencion;
    }

    public void setTiempoAtencion(int tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    public boolean isHabilitada() {
        return isHabilitada;
    }

    public void setHabilitada(boolean habilitada) {
        isHabilitada = habilitada;
    }
}