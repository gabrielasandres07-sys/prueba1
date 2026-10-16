/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_1;

import java.util.Scanner;

public class Prueba_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        System.out.println("=== SISTEMA DE ESTUDIANTES ===");
        System.out.print("Ingrese el nombre del estudiante: ");

        String nombre = entrada.nextLine();

        estudiante.saludar(nombre);

        entrada.close();
    }
}