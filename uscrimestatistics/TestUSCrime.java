/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscrimestatistics;

import uscrimestatistics.filereader.CrimeAnalyser;

/**
 *
 * @author octopus
 */
public class TestUSCrime {
    private final CrimeAnalyser analyser;

    public TestUSCrime(String name) {       
        
        analyser = new CrimeAnalyser(name);
    } 
    public static void main(String[] args) {
        if (args.length == 0 ) {
            System.out.println("No us crime report provided");
            System.exit(0);
        }
       new TestUSCrime(args[0]).run();
    }
    
    public void run() {
        analyser.run();
    }    
    
}
