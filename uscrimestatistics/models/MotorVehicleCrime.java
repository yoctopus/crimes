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
public class MotorVehicleCrime {
    private int theftNumber;
    private double theftRate;

    public MotorVehicleCrime() {
    }

    public MotorVehicleCrime(int theftNumber, double theftRate) {
        this.theftNumber = theftNumber;
        this.theftRate = theftRate;
    }

    public int getTheftNumber() {
        return theftNumber;
    }

    public void setTheftNumber(int theftNumber) {
        this.theftNumber = theftNumber;
    }

    public double getTheftRate() {
        return theftRate;
    }

    public void setTheftRate(double theftRate) {
        this.theftRate = theftRate;
    }

    @Override
    public String toString() {
        return "MotorVehicleCrime{" + "theftNumber=" + theftNumber + ", theftRate=" + theftRate + '}';
    }
    
    
    
}
