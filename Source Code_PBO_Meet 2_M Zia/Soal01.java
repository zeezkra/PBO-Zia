/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal01;

/**
 *
 * @author IMPERIAL
 */
import java.util.Scanner;
public class Soal01 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            long  n;
            System.out.print("input:");
            n = input.nextLong();
            
            if (n>= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println(""+n+"byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                System.out.println(""+n+"short");
            }
            if (n >= Integer.MIN_VALUE && n <+ Integer.MAX_VALUE){
                System.out.println(""+n+"int");
            }
            System.out.println(""+n+"long");   
        }
}