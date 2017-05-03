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
public class RapeCrime {
    private int rapeNumber;
    private double rapeRate;

    public RapeCrime() {
    }

    public RapeCrime(int rapeNumber, double rapeRate) {
        this.rapeNumber = rapeNumber;
        this.rapeRate = rapeRate;
    }

    public int getRapeNumber() {
        return rapeNumber;
    }

    public void setRapeNumber(int rapeNumber) {
        this.rapeNumber = rapeNumber;
    }

    public double getRapeRate() {
        return rapeRate;
    }

    public void setRapeRate(double rapeRate) {
        this.rapeRate = rapeRate;
    }

    @Override
    public String toString() {
        return "RapeCrime{" + "rapeNumber=" + rapeNumber + ", rapeRate=" + rapeRate + '}';
    }
    
    
    
}
