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
public class AggrevatedCrime {
    private int assaultNumber;
    private double assaultRate;

    public AggrevatedCrime() {
    }

    public AggrevatedCrime(int assaultNumber, double assaultRate) {
        this.assaultNumber = assaultNumber;
        this.assaultRate = assaultRate;
    }

    public int getAssaultNumber() {
        return assaultNumber;
    }

    public void setAssaultNumber(int assaultNumber) {
        this.assaultNumber = assaultNumber;
    }

    public double getAssaultRate() {
        return assaultRate;
    }

    public void setAssaultRate(double assaultRate) {
        this.assaultRate = assaultRate;
    }

    @Override
    public String toString() {
        return "AggrevatedCrime{" + "assaultNumber=" + assaultNumber + ", assaultRate=" + assaultRate + '}';
    }
    
    
    
    
}
