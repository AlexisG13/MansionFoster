/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexis Gomez
 */
public class MansionFoster {

    public static void opciones() {
        System.out.println("*************** MENÚ PRINCIPAL ***************");
        System.out.println("1. Sistema Default");
        System.out.println("2. Sistema Administrativo");
        System.out.println("3. Salir");
        System.out.print(": ");
    }

    public static void main(String[] args) {
        Default def = new Default();
        Admin admin = new Admin();
        Piso.nPisos = 6;
        Piso.AgregaPiso();
        ListaPaquetes.IniciarPacks();
        int opcion = 4;
        Scanner leer = new Scanner(System.in);

        while (opcion != 3) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1: //Sistema Default
                        def.Menu();
                        break;
                    case 2: //Sistema Administrativo
                        admin.login();
                        break;
                    case 3:
                        System.out.println("    Que tenga un buen día..");
                        break;
                    default:
                        System.err.println("    Por favor ingrese una opción valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("    Por favor, ingrese un número");
                leer.nextLine();
            }
        }
    }
}
