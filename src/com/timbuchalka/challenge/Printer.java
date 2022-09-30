package com.timbuchalka.challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.duplex = duplex;
        this.pagesPrinted = 0;

    }


}
