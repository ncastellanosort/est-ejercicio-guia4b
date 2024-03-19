/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class Procesos {

    public static String[] numerosIngresados = new String[5];

    public static int[] listaIngresadosINT = new int[5];

    public static int[] numsAleatorios = new int[5];

    public static void llenarAleatoriosVector() {

        for (int i = 0; i < numsAleatorios.length; ++i) {

            numsAleatorios[i] = (int) (Math.random() * 10) + 1;

        }

    }

    public static void ingresarNumerosString() {

        for (int i = 0; i < numerosIngresados.length; ++i) {
            numerosIngresados[i] = JOptionPane.showInputDialog(null, "Ingrese el numero " + (i + 1) + ": ");
        }

    }

    public static void pasarDatosStringAVectorInt() {

        for (int i = 0; i < numerosIngresados.length; ++i) {

            switch (numerosIngresados[i]) {

                case "uno":
                    listaIngresadosINT[i] = 1;
                    break;
                case "dos":
                    listaIngresadosINT[i] = 2;
                    break;
                case "tres":
                    listaIngresadosINT[i] = 3;
                    break;
                case "cuatro":
                    listaIngresadosINT[i] = 4;
                    break;
                case "cinco":
                    listaIngresadosINT[i] = 5;
                    break;
                case "seis":
                    listaIngresadosINT[i] = 6;
                    break;
                case "siete":
                    listaIngresadosINT[i] = 7;
                    break;
                case "ocho":
                    listaIngresadosINT[i] = 8;
                    break;
                case "nueve":
                    listaIngresadosINT[i] = 9;
                    break;
                case "diez":
                    listaIngresadosINT[i] = 10;
                    break;
            }

        }

    }

    public static void mostrarCoincidencias() {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {

                if (listaIngresadosINT[i] == numsAleatorios[j]) {
                    switch (numsAleatorios[i]) {

                        case 1:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);
                            break;
                        case 2:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 3:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 4:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 5:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 6:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 7:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 8:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 9:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                        case 10:
                            System.out.println("Numeros encontrados entre los 2 vectores: " + listaIngresadosINT[i] + " : " + numerosIngresados[i]);

                            break;
                    }

                }

            }

        }

    }

}
