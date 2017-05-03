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
public class ViolentCrime {
    private int crimeNumber;
    private double crimeRate;

    public ViolentCrime() {
    }

    public ViolentCrime(int crimeNumber, double crimeRate) {
        this.crimeNumber = crimeNumber;
        this.crimeRate = crimeRate;
    }

    public int getCrimeNumber() {
        return crimeNumber;
    }

    public void setCrimeNumber(int crimeNumber) {
        this.crimeNumber = crimeNumber;
    }

    public double getCrimeRate() {
        return crimeRate;
    }

    public void setCrimeRate(double crimeRate) {
        this.crimeRate = crimeRate;
    }

    @Override
    public String toString() {
        return "ViolentCrime{" + "crimeNumber=" + crimeNumber + ", crimeRate=" + crimeRate + '}';
    }
    
    
}
