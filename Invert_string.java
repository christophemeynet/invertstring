/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author christophe.meynet
 */
public class Invert_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String q = args[0];
        String r = new String();
        int argslenght = q.length();
        for (int i = 0; i < argslenght; i++) {
            String j = q.substring((argslenght - i - 1), (argslenght - i));
            r = r+j;
        }
        System.out.println(r);
    }

}
