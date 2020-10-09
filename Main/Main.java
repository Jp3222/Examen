package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        Scanner V = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        int opc1, dato;
        int a, b, c;
        System.out.println("Hola");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + (i + 1) + "]Ingresa un dato");
            dato = V.nextInt();
            lista.add(dato);
        }
        do {
            System.out.println("[1]Suma"
                    + "\n[2]Resta"
                    + "\n[3]Multiplicacion"
                    + "\n[4]Salir");
            opc1 = V.nextInt();
            switch (opc1) {
                case 1:
                    System.out.println("Caso suma"
                            + "\nIngrese el indice de 3 posiciones a sumar");
                    do {
                        System.out.println("Indice 1");
                        a = V.nextInt();
                    } while ((a - 1) < 0 || (a - 1) > lista.size());
                    do {
                        System.out.println("Indice 2");
                        b = V.nextInt();
                    } while ((b - 1) < 0 || (b - 1) > lista.size());

                    do {
                        System.out.println("Indice 3");
                        c = V.nextInt();
                    } while ((c - 1) < 0 || (c - 1) > lista.size());

                    metodo.Suma(lista, (a - 1), (b - 1), (c - 1));
                    break;
                case 2:
                    System.out.println("Caso resta"
                            + "\nIngrese el indice de 2 posiciones a restar");

                    do {
                        System.out.println("Indice 1");
                        a = V.nextInt();
                    } while ((a - 1) < 0 || (a - 1) > lista.size());

                    do {
                        System.out.println("Indice 2");
                        b = V.nextInt();
                    } while ((b - 1) < 0 || (b - 1) > lista.size());
                    metodo.Resta(lista, (a - 1), (b - 1));
                    break;
                case 3:
                    System.out.println("Caso Multiplicacion"
                            + "\n Ingrese el indice de 3 posiciones a Multiplicar");

                    do {
                        System.out.println("Indice 1");
                        a = V.nextInt();
                    } while ((a - 1) < 0 || (a - 1) > lista.size());

                    do {
                        System.out.println("Indice 2");
                        b = V.nextInt();
                    } while ((b - 1) < 0 || (b - 1) > lista.size());
                    do {
                        System.out.println("Indice 3");
                        c = V.nextInt();
                    } while ((c - 1) < 0 || (c - 1) > lista.size());
                    metodo.Multiplicacion(lista, (a - 1), (b - 1), (c - 1));
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion erronea");

            }

        } while (opc1 != 4);

    }

}
