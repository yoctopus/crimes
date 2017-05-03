/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscrimestatistics.models;

import java.util.Comparator;

/**
 *
 * @author octopus
 */
public class USCrime {
    private int year;
    private long population;
    private ViolentCrime violentCrime;
    private MurderCrime murderCrime;
    private RapeCrime rapeCrime;
    private RobberyCrime robberyCrime;  
    private AggrevatedCrime aggrevatedCrime;
    private PropertyCrime propertCrime;
    private BurglaryCrime burglaryCrime;
    private LarcenyCrime larcenyCrime;
    private MotorVehicleCrime motorVehicleCrime;

    public USCrime() {
    }

    public USCrime(int year) {
        this.year = year;
    }

    public USCrime(int year, long population) {
        this.year = year;
        this.population = population;
    }
    

    public USCrime(int year, long population, ViolentCrime violentCrime, MurderCrime murderCrime, RapeCrime rapeCrime, RobberyCrime robberyCrime, AggrevatedCrime aggrevatedCrime, BurglaryCrime burglaryCrime, LarcenyCrime larcenyCrime, MotorVehicleCrime motorVehicleCrime) {
        this.year = year;
        this.population = population;
        this.violentCrime = violentCrime;
        this.murderCrime = murderCrime;
        this.rapeCrime = rapeCrime;
        this.robberyCrime = robberyCrime;
        this.aggrevatedCrime = aggrevatedCrime;
        this.burglaryCrime = burglaryCrime;
        this.larcenyCrime = larcenyCrime;
        this.motorVehicleCrime = motorVehicleCrime;
    }

    public USCrime(int year, long population, ViolentCrime violentCrime, MurderCrime murderCrime, RapeCrime rapeCrime, RobberyCrime robberyCrime, AggrevatedCrime aggrevatedCrime, PropertyCrime propertCrime, BurglaryCrime burglaryCrime, LarcenyCrime larcenyCrime, MotorVehicleCrime motorVehicleCrime) {
        this.year = year;
        this.population = population;
        this.violentCrime = violentCrime;
        this.murderCrime = murderCrime;
        this.rapeCrime = rapeCrime;
        this.robberyCrime = robberyCrime;
        this.aggrevatedCrime = aggrevatedCrime;
        this.propertCrime = propertCrime;
        this.burglaryCrime = burglaryCrime;
        this.larcenyCrime = larcenyCrime;
        this.motorVehicleCrime = motorVehicleCrime;
    }

    @Override
    public String toString() {
        return "USCrime{" + "year=" + year +
                ", population=" + population + 
                ", violentCrime=" + violentCrime.toString() + 
                ", murderCrime=" + murderCrime.toString() + 
                ", rapeCrime=" + rapeCrime.toString() + 
                ", robberyCrime=" + robberyCrime.toString() + 
                ", aggrevatedCrime=" + aggrevatedCrime.toString() + 
                ", propertCrime=" + propertCrime.toString() + 
                ", burglaryCrime=" + burglaryCrime.toString() + 
                ", larcenyCrime=" + larcenyCrime.toString() +
                ", motorVehicleCrime=" + motorVehicleCrime.toString() + 
                '}';
    }  

    public PropertyCrime getPropertyCrime() {
        return propertCrime;
    }

    public void setPropertyCrime(PropertyCrime propertCrime) {
        this.propertCrime = propertCrime;
    }  
    public static Comparator<USCrime> crimeComparator = new Comparator<USCrime>() {
        @Override
        public int compare(USCrime o1, USCrime o2) {
            return o1.getYear() < o2.getYear() ? -1 : o1.getYear() >  o2.getYear() ? 1 : 0;
        }
    };

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public ViolentCrime getViolentCrime() {
        return violentCrime;
    }

    public void setViolentCrime(ViolentCrime violentCrime) {
        this.violentCrime = violentCrime;
    }

    public MurderCrime getMurderCrime() {
        return murderCrime;
    }

    public void setMurderCrime(MurderCrime murderCrime) {
        this.murderCrime = murderCrime;
    }

    public RapeCrime getRapeCrime() {
        return rapeCrime;
    }

    public void setRapeCrime(RapeCrime rapeCrime) {
        this.rapeCrime = rapeCrime;
    }

    public RobberyCrime getRobberyCrime() {
        return robberyCrime;
    }

    public void setRobberyCrime(RobberyCrime robberyCrime) {
        this.robberyCrime = robberyCrime;
    }

    public AggrevatedCrime getAggrevatedCrime() {
        return aggrevatedCrime;
    }

    public void setAggrevatedCrime(AggrevatedCrime aggrevatedCrime) {
        this.aggrevatedCrime = aggrevatedCrime;
    }

    public BurglaryCrime getBurglaryCrime() {
        return burglaryCrime;
    }

    public void setBurglaryCrime(BurglaryCrime burglaryCrime) {
        this.burglaryCrime = burglaryCrime;
    }

    public LarcenyCrime getLarcenyCrime() {
        return larcenyCrime;
    }

    public void setLarcenyCrime(LarcenyCrime larcenyCrime) {
        this.larcenyCrime = larcenyCrime;
    }

    public MotorVehicleCrime getMotorVehicleCrime() {
        return motorVehicleCrime;
    }

    public void setMotorVehicleCrime(MotorVehicleCrime motorVehicleCrime) {
        this.motorVehicleCrime = motorVehicleCrime;
    }
    
    
}
