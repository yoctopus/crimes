/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscrimestatistics.filereader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import uscrimestatistics.models.USCrime;

/**
 *
 * main class to implement the myReader class
 */
public class CrimeAnalyser {

    private final int PERCENTAGE_POPULATION_GROWTH = 1;
    private final int MURDER_RATE_HIGHEST = 2;
    private final int MURDER_RATE_LOWEST = 3;
    private final int ROBBERY_RATE_HIGHEST = 4;
    private final int ROBBERY_RATE_LOWEST = 5;
    private final int PERCENTAGE_CHANGE_MOTOR_VEHICLE_CHANGE = 6;
    private final int WHAT_WAS_THE = 7;
    private final int PROPERTY = 1;
    private final int PROPERTY_LOWEST = 1;
    private final int PROPERTY_HIGHEST = 2;
    private final int PROPERTY_GROWTH_BETWEEN = 3;
    private final int PROPERTY_AVERAGE = 4;
    private final int TOTAL_PROPERTY = 5;
    private final int PROPERQ = 6;
    private final int BURGLARY = 2;
    private final int BURGLARY_LOWEST = 1;
    private final int BURGLARY_HIGHEST = 2;
    private final int BURGLARY_GROWTH_BETWEEN = 3;
    private final int BURGLARY_AVERAGE = 4;
    private final int TOTAL_BURGLARY = 5;
    private final int BURGLARYQ = 6;
    private final int Q1 = 3;
    private final int Q = 8;

    private ArrayList<USCrime> usCrimes;
    private final Scanner input;
    private final MyReader reader;

    public CrimeAnalyser(String fileName) {
           
        reader = new MyReader("src/" + fileName);
        input = new Scanner(System.in);
    }

    //main logic for the code
    public void run() {
        if (reader == null) {
            return;
        }
        usCrimes = reader.readFileIntoCrimes();
        if (!usCrimes.isEmpty()) {
            sortCrimes(usCrimes);
            //print("Crimes found " + usCrimes.size());            

            print("********** Welcome to the Crime Statistical Application *******\n");
            doUserInteraction();
        } else {
            print("\n******** No data to be analysed! ***********\n");
        }
    }

    private void doUserInteraction() {
        Date date1 = new Date();
        int request = getUserAnswer();
        while (request != Q) {
            executeUserRequest(request);
            request = getUserAnswer();
        }
        executeQ();
        Date date2 = new Date();
        int seconds = getSeconds(date1, date2);
        print("\n Elapsed time was: " + seconds + " seconds");

    }
    private int getSeconds(Date one, Date two) {
        int ones = one.getHours()*3600 + one.getMinutes()*60+one.getSeconds();
        int twos = two.getHours()*3600 + two.getMinutes()*60+two.getSeconds();
        return twos - ones;
    }

    private void doUserInteraction2() {
        int request = getUserAnswer2();
        while (request != Q1) {
            executeUserRequest2(request);
            request = getUserAnswer2();
        }
    }

    private void doUserPropertyInteraction() {
        int request = getUserAnswerProperty();
        while (request != PROPERQ) {
            executePropertyRequest(request);
            request = getUserAnswerProperty();
        }
    }

    private void doUserBurglaryInteraction() {
        int request = getUserAnswerBurglary();
        while (request != BURGLARYQ) {
            executeBurglaryRequest(request);
            request = getUserAnswerBurglary();
        }
    }

    private int getUserAnswer() {
        print("\nEnter the number of question you want answered\n");
        print(PERCENTAGE_POPULATION_GROWTH + ". What was the percentage in population rate for each consecutive "
                + "year from 1994 to 2013?");
        print(MURDER_RATE_HIGHEST + ". What year was the Murder rate the highest?");
        print(MURDER_RATE_LOWEST + ". What year was the Murder rate the lowest?");
        print(ROBBERY_RATE_HIGHEST + ". What year was the Robbery rate the highest?");
        print(ROBBERY_RATE_LOWEST + ". What year was the Robbery rate the lowest?");
        print(PERCENTAGE_CHANGE_MOTOR_VEHICLE_CHANGE + ". What was the total percentage change in Motor Vehicle"
                + "Theft between 1998 and 2012?");
        print(WHAT_WAS_THE + ". What was...");
        print("Q. Quit the program");
        printOnLine("\n\nEnter your selection : ");
        return getInput();
    }

    private int getUserAnswer2() {
        print("\nEnter the unique statistic \n");
        print(PROPERTY + ". Property");
        print(BURGLARY + ". Burglary");
        print("Q. Back... ");
        printOnLine("\n\nEnter your selection : ");
        return getInput2();
    }

    private int getUserAnswerProperty() {
        print("\nEnter the unique Property statistic \n");
        print(PROPERTY_LOWEST + ". rate the lowest?");
        print(PROPERTY_HIGHEST + ". rate the highest?");
        print(PROPERTY_GROWTH_BETWEEN + ". Growth rate between ?");
        print(PROPERTY_AVERAGE + ". Average rate ?");
        print(TOTAL_PROPERTY + ". total ?");
        print("Q. Back");
        printOnLine("\n\nEnter your selection : ");
        return getInputProperty();
    }

    private int getUserAnswerBurglary() {
        print("\nEnter the unique Burglery statistic \n");
        print(BURGLARY_LOWEST + ". rate lowest?");
        print(BURGLARY_HIGHEST + ". rate highest?");
        print(BURGLARY_GROWTH_BETWEEN + " .Growth rate between?");
        print(BURGLARY_AVERAGE + ". Average rate ?");
        print(TOTAL_BURGLARY + ". total?");
        print("Q. Back");
        printOnLine("\n\nEnter your selection : ");
        return getInputBurglary();
    }

    private void executeUserRequest(int number) {
        switch (number) {
            case PERCENTAGE_POPULATION_GROWTH: {
                executePercentagePopulation();
                break;
            }
            case MURDER_RATE_HIGHEST: {
                executeMurderRateHighest();
                break;
            }
            case MURDER_RATE_LOWEST: {
                executeMurderRateLowest();
                break;
            }
            case ROBBERY_RATE_HIGHEST: {
                executeRobberyRateHighest();
                break;
            }
            case ROBBERY_RATE_LOWEST: {
                executeRobberyRateLowest();
                break;
            }
            case PERCENTAGE_CHANGE_MOTOR_VEHICLE_CHANGE: {
                executePercentageChangeMotorVehicle();
                break;
            }
            case WHAT_WAS_THE: {
                executeWhatWasThe();
                break;
            }
            default: {
                print("You entered an invalid option: " + number);
                doUserInteraction();
            }
        }

    }

    private void executeUserRequest2(int number) {
        switch (number) {
            case PROPERTY: {
                executeProperty();
                break;
            }
            case BURGLARY: {
                executeBurglary();
                break;
            }
            default: {
                print("You entered an invalid option: " + number);
                doUserInteraction2();
            }
        }

    }

    private void executePropertyRequest(int number) {
        switch (number) {
            case PROPERTY_LOWEST: {
                executePropertyLowest();
                break;
            }
            case PROPERTY_HIGHEST: {
                executePropertyHighest();
                break;
            }
            case PROPERTY_GROWTH_BETWEEN: {
                executePropertyGrowthRate();
                break;
            }
            case PROPERTY_AVERAGE: {
                executePropertyAverage();
                break;

            }
            case TOTAL_PROPERTY: {
                executePropertyTotal();
                break;
            }
            default: {
                print("You entered an invalid option: " + number);
                doUserPropertyInteraction();
            }
        }
    }

    private void executeBurglaryRequest(int number) {
        switch (number) {
            case BURGLARY_LOWEST: {
                executeBurglaryLowest();
                break;
            }
            case BURGLARY_HIGHEST: {
                executeBurglaryHighest();
                break;
            }
            case BURGLARY_GROWTH_BETWEEN: {
                executeBurglaryGrowthRate();
                break;
            }
            case BURGLARY_AVERAGE: {
                executeBurglaryAverage();
                break;

            }
            case TOTAL_BURGLARY: {
                executeBurglaryTotal();
                break;
            }
            default: {
                print("You entered an invalid option: " + number);
                doUserBurglaryInteraction();
            }
        }
    }

    private void executePercentagePopulation() {
        print("\nConsecutive population growths\n");
        for (int i = 0; i < usCrimes.size(); i++) {
            USCrime crime1 = usCrimes.get(i);
            if (i == usCrimes.size() - 1) {
                return;
            }
            USCrime crime2 = usCrimes.get(i + 1);
            long pop1 = crime1.getPopulation();
            long pop2 = crime2.getPopulation();
            if (pop1 != 0) {
                print("percentage population growth for "
                        + crime1.getYear() + " - " + crime2.getYear() + " = "
                        + getPercentage(pop1, pop2) + " %");
            } else {
                print("percentage population growth for "
                        + crime1.getYear() + " - last year " + " = 0 %");
            }
        }
    }

    private double getPercentage(long pop1, long pop2) {
        int pop3 = Integer.parseInt(Long.toString(pop1));
        int pop4 = Integer.parseInt(Long.toString(pop2));
        double percent;
        int diff = pop4 - pop3;
        double quotient = diff * Math.pow(pop3, -1);
        percent = quotient * 100;
        return percent;
    }

    private void sortCrimes(ArrayList<USCrime> crimes) {
        Collections.sort(crimes, USCrime.crimeComparator);

    }

    private void executeMurderRateHighest() {
        USCrime crime = getMaxMurderRate(usCrimes);
        print("The Murder rate was highest in " + crime.getYear());
    }

    private void executeMurderRateLowest() {
        USCrime crime = getMinMurderRate(usCrimes);
        print("The Murder rate was lowest in " + crime.getYear());
    }

    private void executeRobberyRateHighest() {
        USCrime crime = getMaxRobberyRate(usCrimes);
        print("The Robbery rate was highest in " + crime.getYear());
    }

    private void executeRobberyRateLowest() {
        USCrime crime = getMinRobberyRate(usCrimes);
        print("The Robbery rate was lowest in " + crime.getYear());
    }

    private void executeWhatWasThe() {
        doUserInteraction2();
    }

    private void executeQ() {
        print("\nThank you for trying the US Crimes Statistics program");
    }

    private void executeProperty() {
        doUserPropertyInteraction();
    }

    private void executeBurglary() {
        doUserBurglaryInteraction();
    }

    private void executePropertyHighest() {
        print("The highest property was " + getYearHighestProperty(usCrimes));
    }

    private void executePropertyLowest() {
        print("The lowest property was " + getYearLowestProperty(usCrimes));

    }

    private void executePropertyAverage() {
        print("The average property was " + getPropertAverage());
    }

    private void executePropertyGrowthRate() {
        print("The growth rate " + getPropertyGrowthRate());
    }

    private void executePropertyTotal() {
        print("The propert total " + getPropertyTotal());
    }

    private void executeBurglaryHighest() {
        print("The highest burglary was " + getYearHighestBurglary(usCrimes));
    }

    private void executeBurglaryLowest() {
        print("The lowest burglary was " + getYearLowestBurglary(usCrimes));
    }

    private void executeBurglaryAverage() {
        print("The average burglary was " + getBurglaryAverage());
    }

    private void executeBurglaryGrowthRate() {
        print("The burglary growth rate " + getBurglaryGrowthRate());
    }

    private void executeBurglaryTotal() {
        print("The burglary total " + getBurglaryTotal());
    }

    private void executePercentageChangeMotorVehicle() {
        USCrime crime98 = getCrime(1998);
        USCrime crime12 = getCrime(2012);
        long pop1 = crime98.getPopulation();
        long pop2 = crime12.getPopulation();
        if (pop1 != 0) {
            print("percentage population growth for "
                    + crime98.getYear() + " - " + crime12.getYear() + " = "
                    + getPercentage(pop1, pop2) + " %");
        }
    }

    private USCrime getMaxMurderRate(ArrayList<USCrime> crimes) {
        USCrime max = new USCrime();
        if (!crimes.isEmpty()) {
            max = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getMurderCrime().getMurderRate()
                        > max.getMurderCrime().getMurderRate()) {
                    max = crimes.get(i);
                }
            }
        }
        return max;
    }

    private USCrime getMinMurderRate(ArrayList<USCrime> crimes) {
        USCrime min = new USCrime();
        if (!crimes.isEmpty()) {
            min = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getMurderCrime().getMurderRate()
                        < min.getMurderCrime().getMurderRate()) {
                    min = crimes.get(i);
                }
            }
        }
        return min;
    }

    private USCrime getMaxRobberyRate(ArrayList<USCrime> crimes) {
        USCrime max = new USCrime();
        if (!crimes.isEmpty()) {
            max = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getRobberyCrime().getRobberyRate()
                        > max.getRobberyCrime().getRobberyRate()) {
                    max = crimes.get(i);
                }
            }
        }
        return max;
    }

    private USCrime getMinRobberyRate(ArrayList<USCrime> crimes) {
        USCrime min = new USCrime();
        if (!crimes.isEmpty()) {
            min = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getRobberyCrime().getRobberyRate()
                        < min.getRobberyCrime().getRobberyRate()) {
                    min = crimes.get(i);
                }
            }
        }
        return min;
    }

    private USCrime getCrime(int year) {
        for (USCrime crime : usCrimes) {
            if (crime.getYear() == year) {
                return crime;
            }
        }
        return null;
    }

    private int getYearHighestProperty(ArrayList<USCrime> crimes) {
        USCrime max = new USCrime();
        if (!crimes.isEmpty()) {
            max = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getPropertyCrime().getCrimeRate()
                        > max.getPropertyCrime().getCrimeRate()) {
                    max = crimes.get(i);
                }
            }
        }
        return max.getPropertyCrime().getCrimeNumber();
    }

    private int getYearLowestProperty(ArrayList<USCrime> crimes) {
        USCrime min = new USCrime();
        if (!crimes.isEmpty()) {
            min = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getPropertyCrime().getCrimeRate()
                        < min.getPropertyCrime().getCrimeRate()) {
                    min = crimes.get(i);
                }
            }
        }
        return min.getPropertyCrime().getCrimeNumber();
    }

    private double getPropertyGrowthRate() {
        ArrayList<USCrime> crimes = new ArrayList<>();
        int minYear = getYear("Enter minimun boundary year");
        int maxYear = getYear("Enter maximum boundary year");
        for (USCrime crime : usCrimes) {
            if (crime.getYear() >= minYear) {
                crimes.add(crime);
            }
        }
        for (USCrime crime : usCrimes) {
            if (crime.getYear() <= maxYear) {
                if (crimes.isEmpty()) {
                    return 0.0;
                }
                crimes.remove(crime);
            }
        }

        double crimeRate = 0.0;
        for (USCrime crime : crimes) {
            crimeRate += crime.getPropertyCrime().getCrimeRate();
        }
        return crimeRate * Math.pow(crimes.size(), -1);
    }

    private int getPropertyTotal() {
        int sum = 0;
        for (USCrime crime : usCrimes) {
            sum += crime.getPropertyCrime().getCrimeNumber();
        }
        return sum;
    }

    private double getPropertAverage() {
        return getPropertyTotal() * Math.pow(usCrimes.size(), -1);
    }

    private int getYearHighestBurglary(ArrayList<USCrime> crimes) {
        USCrime max = new USCrime();
        if (!crimes.isEmpty()) {
            max = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getBurglaryCrime().getBurglaryRate()
                        > max.getBurglaryCrime().getBurglaryRate()) {
                    max = crimes.get(i);
                }
            }
        }
        return max.getBurglaryCrime().getBurglaryNumber();
    }

    private int getYearLowestBurglary(ArrayList<USCrime> crimes) {
        USCrime min = new USCrime();
        if (!crimes.isEmpty()) {
            min = crimes.get(0);
            for (int i = 1; i < crimes.size(); i++) {
                if (crimes.get(i).getBurglaryCrime().getBurglaryRate()
                        < min.getBurglaryCrime().getBurglaryRate()) {
                    min = crimes.get(i);
                }
            }
        }
        return min.getBurglaryCrime().getBurglaryNumber();
    }

    private double getBurglaryGrowthRate() {
        ArrayList<USCrime> crimes = new ArrayList<>();
        int minYear = getYear("Enter minimun boundary year");
        int maxYear = getYear("Enter maximum boundary year");
        for (USCrime crime : usCrimes) {
            if (crime.getYear() >= minYear) {
                crimes.add(crime);
            }
        }
        for (USCrime crime : usCrimes) {
            if (crime.getYear() <= maxYear) {
                if (crimes.isEmpty()) {
                    return 0.0;
                }
                crimes.remove(crime);
            }
        }

        double crimeRate = 0.0;
        for (USCrime crime : crimes) {
            crimeRate += crime.getBurglaryCrime().getBurglaryRate();
        }
        return crimeRate * Math.pow(crimes.size(), -1);

    }

    private int getBurglaryTotal() {
        int sum = 0;
        for (USCrime crime : usCrimes) {
            sum += crime.getBurglaryCrime().getBurglaryNumber();
        }
        return sum;
    }

    private double getBurglaryAverage() {
        return getBurglaryTotal() * Math.pow(usCrimes.size(), -1);
    }

    private void printOnLine(String s) {
        //screen.printOnLine(s);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print(s);
            }            
        });
        thread.start();
        
    }

    private void print(String s) {
        //screen.print(s);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(s);
            }            
        });
        thread.start();        
    }

    private int getInput() {
        String string = input.next();
        return !string.equalsIgnoreCase("q") ? Integer.parseInt(string) : Q;
    }

    private int getInput2() {
        String string = input.next();
        return !string.equalsIgnoreCase("q") ? Integer.parseInt(string) : Q1;
    }

    private int getInputProperty() {
        String string = input.next();
        return !string.equalsIgnoreCase("q") ? Integer.parseInt(string) : PROPERQ;
    }

    private int getInputBurglary() {
        String string = input.next();
        return !string.equalsIgnoreCase("q") ? Integer.parseInt(string) : BURGLARYQ;
    }

    private int getYear(String s) {
        print(s);
        return input.nextInt();
    }

}
