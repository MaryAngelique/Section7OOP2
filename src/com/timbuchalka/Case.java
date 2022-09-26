package com.timbuchalka;

public class Case {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Case(Case theCase, Monitor monitor, Motherboard motherboard) {

        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;

    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
