/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

/**
 *
 * @author rkhatchadourian
 */
public class LoopTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 20;
        int lineCount = 0;
        while (x > 0) {            
            System.out.println(lineCount++ + ": x is greater than 0");
            --x;
        }
    }
    
}
