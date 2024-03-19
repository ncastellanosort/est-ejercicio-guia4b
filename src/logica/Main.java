/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
        Pedir al usuario que digite 5 números entre 1 y 10 en cadenas de caracteres (uno, dos, ...), crear un vector 
        y llenarlo con 5 números aleatorios entre 1 y 10, buscar cada número ingresado en el primer 
        vector, si está en el segundo vector indicar los elementos en letras y en número, 
        si no está indicar que el elemento no está.
        
        
         */

//        Scanner in = new Scanner(System.in);
//
//        // 5 numeros entre 1 y 10
//        String[] numerosIngresados = new String[5];
//
//        int[] listaIngresadosINT = new int[5];
//
//        // 5 numeros aleatorios entre 1 y 10
//        int[] numsAleatorios = new int[5];
        
        Procesos.llenarAleatoriosVector();

//        for (int i = 0; i < numsAleatorios.length; ++i) {
//
//            numsAleatorios[i] = (int) (Math.random() * 10) + 1;
//
//        }

//        System.out.println("\nIngrese 5 numeros entre 1 y 10 (uno, dos, tres, ...)");

        // llenar la lista de numeros ingresados
//        for (int i = 0; i < numerosIngresados.length; ++i) {
//
//            System.out.printf("Ingrese el numero %d: ", (i + 1));
//            numerosIngresados[i] = in.nextLine();
//        }
        
        Procesos.ingresarNumerosString();

        System.out.println();
        
        Procesos.pasarDatosStringAVectorInt();

//        for (int i = 0; i < numerosIngresados.length; ++i) {
//
//            switch (numerosIngresados[i]) {
//
//                case "uno":
//                    listaIngresadosINT[i] = 1;
//                    break;
//                case "dos":
//                    listaIngresadosINT[i] = 2;
//                    break;
//                case "tres":
//                    listaIngresadosINT[i] = 3;
//                    break;
//                case "cuatro":
//                    listaIngresadosINT[i] = 4;
//                    break;
//                case "cinco":
//                    listaIngresadosINT[i] = 5;
//                    break;
//                case "seis":
//                    listaIngresadosINT[i] = 6;
//                    break;
//                case "siete":
//                    listaIngresadosINT[i] = 7;
//                    break;
//                case "ocho":
//                    listaIngresadosINT[i] = 8;
//                    break;
//                case "nueve":
//                    listaIngresadosINT[i] = 9;
//                    break;
//                case "diez":
//                    listaIngresadosINT[i] = 10;
//                    break;
//            }
//
//        }

        System.out.println("");

//        System.out.println("Numeros en TIPO INT de la listaIngresados: ");
//        for (int numero : listaIngresadosINT) {
//            System.out.println(numero);
//        }
//
//        System.out.println("\nNumeros aleatorios: ");
//        for (int numero : numsAleatorios) {
//            System.out.println(numero);
//        }

        System.out.println("");
        
        Procesos.mostrarCoincidencias();

//        for (int i = 0; i < 5; ++i) {
//            for (int j = 0; j < 5; ++j) {
//
//                if (listaIngresadosINT[i] == numsAleatorios[j]) {
//                    switch (numsAleatorios[i]) {
//
//                        case 1:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//                            break;
//                        case 2:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 3:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 4:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 5:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 6:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 7:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 8:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 9:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                        case 10:
//                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
//
//                            break;
//                    }
//
//                }
//
//            }
//
//        }

    }

}
