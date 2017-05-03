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
public class RobberyCrime {
    private int robberyNumber;
    private double robberyRate;

    public RobberyCrime() {
    }

    public RobberyCrime(int robberyNumber, double robberyRate) {
        this.robberyNumber = robberyNumber;
        this.robberyRate = robberyRate;
    }

    public int getRobberyNumber() {
        return robberyNumber;
    }

    public void setRobberyNumber(int robberyNumber) {
        this.robberyNumber = robberyNumber;
    }

    public double getRobberyRate() {
        return robberyRate;
    }

    public void setRobberyRate(double robberyRate) {
        this.robberyRate = robberyRate;
    }

    @Override
    public String toString() {
        return "RobberyCrime{" + "robberyNumber=" + robberyNumber + ", robberyRate=" + robberyRate + '}';
    }
    
    
    
    
}
