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
public class BurglaryCrime {
    private int burglaryNumber;
    private double burglaryRate;

    public BurglaryCrime() {
    }

    public BurglaryCrime(int burglaryNumber, double burglaryRate) {
        this.burglaryNumber = burglaryNumber;
        this.burglaryRate = burglaryRate;
    }

    public int getBurglaryNumber() {
        return burglaryNumber;
    }

    public void setBurglaryNumber(int burglaryNumber) {
        this.burglaryNumber = burglaryNumber;
    }

    public double getBurglaryRate() {
        return burglaryRate;
    }

    public void setBurglaryRate(double burglaryRate) {
        this.burglaryRate = burglaryRate;
    }

    @Override
    public String toString() {
        return "BurglaryCrime{" + "burglaryNumber=" + burglaryNumber + ", burglaryRate=" + burglaryRate + '}';
    }
    
    
    
    
}
