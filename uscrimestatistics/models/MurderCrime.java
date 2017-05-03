/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscrimestatistics.models;

/**
 *
 * @author octopus
 */
public class MurderCrime {
    private int manSlaughter;
    private double murderRate;

    public MurderCrime() {
    }

    public MurderCrime(int manSlaughter, double rate) {
        this.manSlaughter = manSlaughter;
        this.murderRate = rate;
    }

    public int getManSlaughter() {
        return manSlaughter;
    }

    public void setManSlaughter(int manSlaughter) {
        this.manSlaughter = manSlaughter;
    }

    public double getMurderRate() {
        return murderRate;
    }

    public void setMurderRate(double murderRate) {
        this.murderRate = murderRate;
    }

    @Override
    public String toString() {
        return "MurderCrime{" + "manSlaughter=" + manSlaughter + ", murderRate=" + murderRate + '}';
    }
    
    
}
