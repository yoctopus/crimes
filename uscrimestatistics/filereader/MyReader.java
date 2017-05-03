/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscrimestatistics.filereader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import uscrimestatistics.models.AggrevatedCrime;
import uscrimestatistics.models.BurglaryCrime;
import uscrimestatistics.models.LarcenyCrime;
import uscrimestatistics.models.MotorVehicleCrime;
import uscrimestatistics.models.MurderCrime;
import uscrimestatistics.models.PropertyCrime;
import uscrimestatistics.models.RapeCrime;
import uscrimestatistics.models.RobberyCrime;
import uscrimestatistics.models.USCrime;
import uscrimestatistics.models.ViolentCrime;

/**
 *
 * @author octopus
 */

public class MyReader {
    private ArrayList<USCrime> uSCrimes;
    // th file to be read
    private File file;
    //file reader object to read each character in a line in th file
    private FileReader fileReader;
    //buffered reader buffers each character from the file reader into string
    private BufferedReader bufferedReader;
    
    /**
     *constructor with a parameter file
     * @param file is required to be read
     */
    public MyReader(File file) {
        try {
            this.file = file;
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(getFileReader());
        } catch (FileNotFoundException ex) {
            
            System.out.println(ex.getMessage());
            bufferedReader = null;
        }
        uSCrimes = new ArrayList<>();
    }

    /**
     *constructor with parameter file name
     * @param fileName the name of the file to be read
     */
    public MyReader(String fileName) {        
        this (new File(fileName));
        //crates a new file with the filename and calls this constructor
    }
    public String getFileName() {
        return getFile().getAbsolutePath();
    }
    
    /**
     * method to read the file
     * @return a string builder with the file contents
     */
    public ArrayList<USCrime> readFileIntoCrimes() {
        ArrayList<USCrime> crimes = new ArrayList<>();
        if (getBufferedReader() == null) {
            return null;
        }        
        String line;
        try {
            int i = 0;
            while ((line = getBufferedReader().readLine()) != null) {
                if (i > 0) {                    
                    crimes.add(getUSCrime(line));
                }
                i++;
                 
            }
        } catch (IOException ex) {
            // Logger.getLogger(MyReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }         
        return crimes;
    }    
    public USCrime getUSCrime(String line) {        
        USCrime crime = new USCrime();
        String[] crimes = line.split(",");            
        
        int year = Integer.parseInt(crimes[0]);        
        long population = Long.parseLong(crimes[1]);
        ViolentCrime violentCrime = new ViolentCrime();
        violentCrime.setCrimeNumber(Integer.parseInt(crimes[2]));
        violentCrime.setCrimeRate(Double.parseDouble(crimes[3]));
        MurderCrime murderCrime = new MurderCrime();
        murderCrime.setManSlaughter(Integer.parseInt(crimes[4]));
        murderCrime.setMurderRate(Double.parseDouble(crimes[5]));
        RapeCrime rapeCrime = new RapeCrime();
        rapeCrime.setRapeNumber(Integer.parseInt(crimes[6]));
        rapeCrime.setRapeRate(Double.parseDouble(crimes[7]));
        RobberyCrime robberyCrime = new RobberyCrime();  
        robberyCrime.setRobberyNumber(Integer.parseInt(crimes[8]));
        robberyCrime.setRobberyRate(Double.parseDouble(crimes[9]));
        AggrevatedCrime aggrevatedCrime = new AggrevatedCrime();
        aggrevatedCrime.setAssaultNumber(Integer.parseInt(crimes[10]));
        aggrevatedCrime.setAssaultRate(Double.parseDouble(crimes[11]));
        PropertyCrime propertyCrime = new PropertyCrime();
        propertyCrime.setCrimeNumber(Integer.parseInt(crimes[12]));
        propertyCrime.setCrimeRate(Double.parseDouble(crimes[13]));
        BurglaryCrime burglaryCrime = new BurglaryCrime();
        burglaryCrime.setBurglaryNumber(Integer.parseInt(crimes[14]));
        burglaryCrime.setBurglaryRate(Double.parseDouble(crimes[15]));
        LarcenyCrime larcenyCrime = new LarcenyCrime();
        larcenyCrime.setLarcenyNumber(Integer.parseInt(crimes[16]));
        larcenyCrime.setLarcenyRate(Double.parseDouble(crimes[17]));
        MotorVehicleCrime motorVehicleCrime = new MotorVehicleCrime();
        motorVehicleCrime.setTheftNumber(Integer.parseInt(crimes[18]));
        motorVehicleCrime.setTheftRate(Double.parseDouble(crimes[19])); 
        
        crime.setYear(year);
        crime.setPopulation(population);
        crime.setViolentCrime(violentCrime);
        crime.setMurderCrime(murderCrime);
        crime.setRapeCrime(rapeCrime);
        crime.setRobberyCrime(robberyCrime);
        crime.setAggrevatedCrime(aggrevatedCrime);
        crime.setPropertyCrime(propertyCrime);
        crime.setBurglaryCrime(burglaryCrime);
        crime.setLarcenyCrime(larcenyCrime);
        crime.setMotorVehicleCrime(motorVehicleCrime);        
        return crime;
    }   

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the fileReader
     */
    public final FileReader getFileReader() {
        return fileReader;
    }

    /**
     * @param fileReader the fileReader to set
     */
    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    /**
     * @return the bufferedReader
     */
    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    /**
     * @param bufferedReader the bufferedReader to set
     */
    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }
    
}
