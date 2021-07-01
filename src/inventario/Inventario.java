/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import clases.Televisor;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while(!salir){
            System.out.println("1. Ingresar Televisor");
            System.out.println("2. Ingresar Camara");
            System.out.println("3. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    IngresarTv();
                    break;
                case 2:
                    break;
                 case 3:
                     salir=true;
                    break;
                 default:
                    System.out.println("Solo opciones entre 1 y 5");
            }
        }
    }
    
    public static void IngresarTv(){
        Scanner sn = new Scanner(System.in);
        Televisor tv = new Televisor();
        System.out.println("Ingrese Marca (Solo letras mayusculas, minimo 4 caracteres)");
        tv.setMarca(sn.nextLine());
        System.out.println("Ingrese pulgadas");
        tv.setPulgadas(sn.nextInt());
        System.out.println("Ingrese valor tv (Valor en USD menor a 1000)");
        tv.setValor(sn.nextFloat());
        tv.printTelevisor();
    }
    
}
