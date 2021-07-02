/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Televisor implements interfaz.IValidacionTv{
    private String marca;
    private String modelo;
    private int pulgadas;
    private String smartTv;
    private String nombreEmpresaCable;
    private float valor;

    public Televisor() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        boolean sigue = true;
        if(ValidarValor(valor)){
            this.valor = valor;
            sigue = false;
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca un valor valido");
                marca = sc.nextLine();
                if(ValidarValor(valor)){
                    this.valor = valor;
                    sigue = false;
                }
            }
        }  
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        boolean sigue = true;
        if(ValidarMarca(marca.trim())){
            this.marca = marca.trim();
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca una marca valida");
                marca = sc.nextLine();
                if(ValidarMarca(marca.trim())){
                    this.marca = marca.trim();
                    sigue = false;
                }
            }
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        boolean sigue = true;
        if(ValidarModelo(modelo.trim())){
            this.modelo = modelo.trim();
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca una modelo valido");
                modelo = sc.nextLine();
                if(ValidarModelo(modelo.trim())){
                    this.modelo = modelo.trim();
                    sigue = false;
                }
            }
        }
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        boolean sigue = true;
        if(ValidarPulgadas(pulgadas)){
            this.pulgadas = pulgadas;
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca pulgadas validas");
                pulgadas = Integer.valueOf(sc.nextLine());
                if(ValidarPulgadas(pulgadas)){
                    this.pulgadas = pulgadas;
                    sigue = false;
                }
            }
        }
    }

    public String getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(String smartTv) {
        boolean sigue = true;
        if(ValidarSmartTv(smartTv.trim())){
            this.smartTv = smartTv.trim();
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca caracter válido (S o N)");
                smartTv = sc.nextLine();
                if(ValidarSmartTv(smartTv.trim())){
                    this.smartTv = smartTv.trim();
                    sigue = false;
                }
            }
        }
    }

    public String getNombreEmpresaCable() {
        return nombreEmpresaCable;
    }

    public void setNombreEmpresaCable(String nombreEmpresaCable) {
        boolean sigue = true;
        if(ValidarNombreEmpresaCable(nombreEmpresaCable.trim())){
            this.nombreEmpresaCable = nombreEmpresaCable.trim();
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca nombre empresa de cable");
                nombreEmpresaCable = sc.nextLine();
                if(ValidarNombreEmpresaCable(nombreEmpresaCable.trim())){
                    this.nombreEmpresaCable = nombreEmpresaCable.trim();
                    sigue = false;
                }
            }
        }
    }
    
    @Override
    public boolean ValidarMarca(String marca){
        char[] charArray;
        boolean sigue = true;
        char caracter;
        int contador = 0;
        charArray = marca.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            caracter = charArray[i];
            for(int j = 0; j < charArray.length; j++){
                if(charArray[j] == caracter){
                    contador++;
                }    
            }
            if(contador > 1){
            sigue = false;
            }
            contador = 0;
        }
        if(!sigue){
            System.out.println("No se deben reperir letras");
        }
        if(sigue){
            if(marca.matches("[A-Z]{4,}")){
                return true;
            }else{
                System.out.println("Recuenda que deben ser solo mayúsculas minimo 4 caracteres");
            }     
        }
        return false;
    }
    
    @Override
    public boolean ValidarModelo(String modelo){
        if(modelo.matches("(?![aeiouAEIOU])[a-zA-Z]{2}(?![0])[0-9]{3}(?![02468])[0-9]")){
            String numeros = modelo.substring(2,6);
            System.out.println(numeros);
            int suma = 0;
            for(int i=0; i<numeros.length(); i++){
                suma+=(Character.getNumericValue(numeros.charAt(i)));
            }
            if(suma<=20){
                if(modelo.contains("7")){
                    return true;
                }else{
                    System.out.println("debe incluir al menos un numero 7");
                }
            }else{
                System.out.println("La suma de los digitos no debe ser mayor a 20");
            }
        }else{
            System.out.println("Por favor ingrese 2 consonantes y 4 digitos");
        }
        return false;
    }
    
    @Override
    public boolean ValidarPulgadas(int pulgadas){
        if(pulgadas >= 32 && pulgadas <= 55){
            return true;
        }else{
            System.out.println("Las pulgadas deben estar entre 32 y 55");
            return false;
        }
    }
    
    @Override
    public boolean ValidarSmartTv(String smartTv){
        if(smartTv.matches("[SNsn]{1}")){
            return true;
        }else{
            System.out.println("Debe ingresar solo una letra (S o N)");
            return false;
        }
    }
    @Override
    public boolean ValidarNombreEmpresaCable(String nEmpCable){
        if(nEmpCable.matches("[A-Z]{1}[a-z]{1,7}")){
            return true;
        }else{
            System.out.println("Recuende que la primer letra debe ser mayuscula y las restantes minusculas (Max 8 caracteres)");
            return false;
        }
    }
    @Override
    public boolean ValidarValor(float valor){
        return valor > 0 && valor < 1000;
    }
    
    public void printTelevisor(){
        System.out.println("\n--Información del Televisor--");
        System.out.println("Marca                   : " + getMarca());
        System.out.println("Modelo                  : " + getModelo());
        System.out.println("Pulgadas                : " + getPulgadas());
        System.out.println("Smart TV                : " + getSmartTv());
        System.out.println("Nombre empresa de cable : " + getNombreEmpresaCable());
        System.out.println("Valor (US)              : " + getValor()+"\n\n");
    }
}