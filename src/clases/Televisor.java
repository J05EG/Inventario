/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Televisor implements interfaz.IValidacionTv{
    private String marca;
    private String modelo;
    private int pulgadas;
    private char smartTv;
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
        this.pulgadas = pulgadas;
    }

    public char getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(char smartTv) {
        this.smartTv = smartTv;
    }

    public String getNombreEmpresaCable() {
        return nombreEmpresaCable;
    }

    public void setNombreEmpresaCable(String nombreEmpresaCable) {
        this.nombreEmpresaCable = nombreEmpresaCable;
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
                    System.out.println("no hay un 7");
                }
            }else{
                System.out.println("la suma es > 20");
            }
        }else{
            System.out.println("no cumple la expresion");
        }
        return false;
    }
    
    @Override
    public boolean ValidarPulgadas(int pulgadas){
        return true;
    }
    
    @Override
    public boolean ValidarSmartTv(char smartTv){
        return true;
    }
    @Override
    public boolean ValidarNombreEmpresaCable(String nEmpCable){
        return true;
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
