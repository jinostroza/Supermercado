package com.company;

/**
 * Created by jinostrozau on 05-10-2017.
 */
public class Evento implements Runnable {

    double time;
    Runnable runnable;

    Evento(double time, Runnable aRunnable) {
        this.time = time;
        runnable = aRunnable;
    }

    public boolean lessThan(Comparable y) {
        Evento e = (Evento) y; // Will throw an exception if y is not an Event
        return this.time <= e.time;
    }

    @Override
    public void run() {
        runnable.run();
    }
}
