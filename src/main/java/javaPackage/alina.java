/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaPackage;

import java.util.Scanner;

/**
 *
 * @author CL3-PC28
 */
public class alina {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("[1] - Hotdog");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = input.nextInt();
        
        if(choice == 1)
        {
            System.out.println("Hotdog");
        }
    }
}