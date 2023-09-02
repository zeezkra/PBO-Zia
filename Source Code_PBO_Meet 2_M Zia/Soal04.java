/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal04;

/**
 *
 * @author IMPERIAL
 */
public class Soal04 {
    
    static short methodOne(long f)
    {    
        int i = (int) 1;
        return (short)i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
