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
public class LarcenyCrime {
    private int larcenyNumber;
    private double larcenyRate;

    public LarcenyCrime() {
    }

    public LarcenyCrime(int larcenyNumber, double larcenyRate) {
        this.larcenyNumber = larcenyNumber;
        this.larcenyRate = larcenyRate;
    }

    public int getLarcenyNumber() {
        return larcenyNumber;
    }

    public void setLarcenyNumber(int larcenyNumber) {
        this.larcenyNumber = larcenyNumber;
    }

    public double getLarcenyRate() {
        return larcenyRate;
    }

    public void setLarcenyRate(double larcenyRate) {
        this.larcenyRate = larcenyRate;
    }

    @Override
    public String toString() {
        return "LarcenyCrime{" + "larcenyNumber=" + larcenyNumber + ", larcenyRate=" + larcenyRate + '}';
    }
    
    
    
}
