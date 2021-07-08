/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import clases.Camara;
import clases.Televisor;
import java.util.Scanner;

/**
 *
 * @author PC
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
                    IngresarCam();
                    break;
                 case 3:
                     salir=true;
                    break;
                 default:
                    System.out.println("Solo opciones entre 1 y 3");
            }
        }
    }
    
    public static void IngresarTv(){
        Scanner sn = new Scanner(System.in);
        Televisor tv = new Televisor();
        boolean sigue = false;
        System.out.println("Ingrese Marca (Solo letras mayusculas, minimo 4 caracteres)");
        tv.setMarca(sn.nextLine());
        System.out.println("Ingrese Modelo (2 consonantes y 4 números)");
        tv.setModelo(sn.nextLine());
        while(!sigue){
            System.out.println("Ingrese pulgadas min 32, max 55");
            try{
                tv.setPulgadas(Integer.valueOf(sn.nextLine()));
                sigue = true;
            }catch(NumberFormatException e){
                System.out.println("Ingresar valor solicitado por favor. Error: "+e.getMessage());
            }
        }
        System.out.println("Es Smart TV? Ingrese S o N (Si, No)");
        tv.setSmartTv(sn.nextLine());
        System.out.println("Ingrese Nombre de Empresa Cable (Max 8 caracteres en mayúsculas)");
        tv.setNombreEmpresaCable(sn.nextLine());
        sigue = false;
        while(!sigue){
            System.out.println("Ingrese valor tv (Valor en USD menor a 1000)");
            try{
                tv.setValor(Float.parseFloat(sn.nextLine()));
                sigue = true;
            }catch(NumberFormatException e){
                System.out.println("Ingresar valor solicitado por favor. Error: "+e.getMessage());
            }
        }
        tv.printTelevisor();
    }
    
    public static void IngresarCam(){
        Scanner sn = new Scanner(System.in);
        Camara cam = new Camara();
        boolean sigue = false;
        System.out.println("Ingrese Código");
        cam.setCodigo(sn.nextLine());
        System.out.println("Ingrese Modelo (2 consonantes y 4 números)");
        cam.setModelo(sn.nextLine());
        while(!sigue){
            System.out.println("Ingrese Giro de 0 a 360° (Solo el número)");
            try{
                cam.setGiro(Integer.valueOf(sn.nextLine()));
                sigue = true;
            }catch(NumberFormatException e){
                System.out.println("Ingresar valor solicitado por favor. Error: "+e.getMessage());
            }
        }
        sigue = false;
        while(!sigue){
            System.out.println("Ingrese Megapixeles (min 5,0 - max 16,3)");
            try{
                cam.setMegapixeles(Float.parseFloat(sn.nextLine()));
                sigue = true;
            }catch(NumberFormatException e){
                System.out.println("Ingresar valor solicitado por favor. Error: "+e.getMessage());
            }
        }
        sigue = false;
        while(!sigue){
            System.out.println("Ingrese Alcance de Wifi en metros (mix 3,0 - max 14,0)");
            try{
                cam.setMetrosAlcanceWifi(Float.parseFloat(sn.nextLine()));
                sigue = true;
            }catch(NumberFormatException e){
                System.out.println("Ingresar valor solicitado por favor. Error: "+e.getMessage());
            }
        }
        sigue = false;
        while(!sigue){
            System.out.println("Ingrese valor Camara (Valor en USD mayor a 100)");
            try{
                cam.setValor(Float.parseFloat(sn.nextLine()));
                sigue = true;
            }catch(NumberFormatException e){
                System.out.println("Ingresar valor solicitado por favor. Error: "+e.getMessage());
            }
        }
        cam.printCamara();
    }
}
